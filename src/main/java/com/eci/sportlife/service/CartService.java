package com.eci.sportlife.service;

import com.eci.sportlife.dto.request.AddToCartRequest;
import com.eci.sportlife.dto.response.CartResponse;
import com.eci.sportlife.exception.BusinessException;
import com.eci.sportlife.exception.ResourceNotFoundException;
import com.eci.sportlife.model.Cart;
import com.eci.sportlife.model.CartItem;
import com.eci.sportlife.model.Product;
import com.eci.sportlife.model.User;
import com.eci.sportlife.repository.CartRepository;
import com.eci.sportlife.repository.ProductRepository;
import com.eci.sportlife.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartRepository cartRepo;
    private final UserRepository userRepo;
    private final ProductRepository productRepo;

    public CartResponse getCart(String email) {
        User user = userRepo.findByEmail(email).orElseThrow();
        Cart cart = cartRepo.findByUser(user).orElse(Cart.builder().user(user).build());
        return mapToResponse(cart);
    }

    public CartResponse addItem(String email, AddToCartRequest req) {
        User user = userRepo.findByEmail(email).orElseThrow();
        Product product = productRepo.findById(req.getProductId())
            .orElseThrow(() -> new ResourceNotFoundException("Producto no encontrado"));
        if (product.getStock() < req.getQuantity())
            throw new BusinessException("Stock insuficiente", HttpStatus.UNPROCESSABLE_ENTITY);

        Cart cart = cartRepo.findByUser(user)
            .orElse(Cart.builder().user(user).build());

        cart.getItems().stream()
            .filter(i -> i.getProduct().getId().equals(product.getId()))
            .findFirst()
            .ifPresentOrElse(
                i -> i.setQuantity(i.getQuantity() + req.getQuantity()),
                () -> cart.getItems().add(CartItem.builder()
                    .cart(cart).product(product)
                    .quantity(req.getQuantity())
                    .unitPrice(product.getPrice()).build())
            );
        cartRepo.save(cart);
        return mapToResponse(cart);
    }

    private CartResponse mapToResponse(Cart cart) { /* mapeo a DTO */ return null; }
}

