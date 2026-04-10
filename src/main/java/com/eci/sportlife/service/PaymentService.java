package com.eci.sportlife.service;

import com.eci.sportlife.dto.request.PaymentRequest;
import com.eci.sportlife.dto.response.PaymentResponse;
import com.eci.sportlife.model.Transaction;
import com.eci.sportlife.model.Transaction.*;
import com.eci.sportlife.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final TransactionRepository transactionRepository;

    public boolean process(String paymentMethod, BigDecimal total, String cardToken) {
        // Simulación de procesamiento de pago
        return true;
    }

    public PaymentResponse processPayment(PaymentRequest req) {
        // Simulación: si el monto es par, pago aprobado; si es impar, rechazado
        boolean approved = req.getAmount().intValue() % 2 == 0;
        String status = approved ? "PAID" : "REJECTED";
        String transactionId = UUID.randomUUID().toString();
        Transaction.ProviderResponse providerResponse = ProviderResponse.builder()
                .code(approved ? "00" : "99")
                .message(approved ? "Pago aprobado" : "Pago rechazado")
                .authorizationCode(approved ? UUID.randomUUID().toString().substring(0, 8) : null)
                .bank("Banco Simulado")
                .build();
        Transaction tx = Transaction.builder()
                .id(transactionId)
                .orderId(req.getOrderId())
                .userId(null)
                .status(status)
                .paymentMethod(req.getPaymentMethod())
                .amount(req.getAmount())
                .providerResponse(providerResponse)
                .build();
        transactionRepository.save(tx);
        return PaymentResponse.builder()
                .transactionId(transactionId)
                .status(status)
                .message(providerResponse.getMessage())
                .build();
    }
}
