package com.eci.sportlife.service;

import com.eci.sportlife.dto.request.CheckoutRequest;
import com.eci.sportlife.dto.response.OrderResponse;
import com.eci.sportlife.exception.BusinessException;
import com.eci.sportlife.model.Cart;
import com.eci.sportlife.model.Order;
import com.eci.sportlife.model.User;
import com.eci.sportlife.model.OrderStatus;
import com.eci.sportlife.model.OrderItem;
import com.eci.sportlife.model.Transaction;
import com.eci.sportlife.repository.CartRepository;
import com.eci.sportlife.repository.OrderRepository;
import com.eci.sportlife.repository.ProductRepository;
import com.eci.sportlife.repository.TransactionRepository;
import com.eci.sportlife.repository.UserRepository;
import com.eci.sportlife.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final CartRepository cartRepo;
    private final OrderRepository orderRepo;
    private final ProductRepository productRepo;
    private final TransactionRepository transactionRepo;
    private final UserRepository userRepo;
    private final PaymentService paymentService;

    @Transactional
    public OrderResponse checkout(String email, CheckoutRequest req) {
        User user = userRepo.findByEmail(email).orElseThrow();
        Cart cart = cartRepo.findByUser(user)
            .orElseThrow(() -> new BusinessException("Carrito vacío", HttpStatus.UNPROCESSABLE_ENTITY));
        if (cart.getItems().isEmpty())
            throw new BusinessException("El carrito está vacío", HttpStatus.UNPROCESSABLE_ENTITY);

        // Validar stock nuevamente
        cart.getItems().forEach(item -> {
            if (item.getProduct().getStock() < item.getQuantity())
                throw new BusinessException("Stock insuficiente para " + item.getProduct().getName(),
                    HttpStatus.UNPROCESSABLE_ENTITY);
        });

        BigDecimal total = cart.calculateTotal();
        String transactionId = UUID.randomUUID().toString();

        // Procesar pago (Strategy pattern)
        boolean paid = paymentService.process(req.getPaymentMethod(), total, req.getCardToken());

        Order order = Order.builder()
            .user(user).total(total).transactionId(transactionId)
            .status(paid ? OrderStatus.PAID : OrderStatus.REJECTED).build();

        cart.getItems().forEach(ci -> order.getItems().add(
            OrderItem.builder().order(order).product(ci.getProduct())
                .quantity(ci.getQuantity()).unitPrice(ci.getUnitPrice()).build()
        ));
        orderRepo.save(order);

        if (paid) {
            // Descontar stock
            cart.getItems().forEach(ci -> {
                ci.getProduct().setStock(ci.getProduct().getStock() - ci.getQuantity());
                productRepo.save(ci.getProduct());
            });
            cart.getItems().clear();
            cartRepo.save(cart);
        }

        // Guardar transacción en MongoDB
        transactionRepo.save(Transaction.builder()
            .orderId(order.getId()).userId(user.getId())
            .status(order.getStatus().name())
            .paymentMethod(req.getPaymentMethod())
            .amount(total).build());

        return OrderResponse.builder()
            .orderId(order.getId()).transactionId(transactionId)
            .status(order.getStatus().name()).total(total)
            .message(paid ? "Pago aprobado. ¡Gracias por tu compra!"
                          : "Pago rechazado. Por favor intenta nuevamente.")
            .createdAt(order.getCreatedAt()).build();
    }
}
