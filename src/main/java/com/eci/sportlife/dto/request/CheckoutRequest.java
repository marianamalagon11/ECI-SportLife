package com.eci.sportlife.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CheckoutRequest {
    @NotBlank private String paymentMethod;
    @NotBlank private String cardToken;
}

