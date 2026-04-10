package com.eci.sportlife.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentRequest {
    @NotNull
    private Long orderId;
    @NotBlank
    private String paymentMethod;
    @NotNull
    private BigDecimal amount;
    @NotBlank
    private String cardToken;
}

