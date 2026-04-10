package com.eci.sportlife.controller;

import com.eci.sportlife.dto.request.CheckoutRequest;
import com.eci.sportlife.dto.response.OrderResponse;
import com.eci.sportlife.service.OrderService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
@Tag(name = "Orders")
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/checkout")
    public ResponseEntity<OrderResponse> checkout(@Valid @RequestBody CheckoutRequest req,
                                                   Authentication auth) {
        OrderResponse response = orderService.checkout(auth.getName(), req);
        HttpStatus status = "PAID".equals(response.getStatus())
            ? HttpStatus.CREATED : HttpStatus.OK;
        return ResponseEntity.status(status).body(response);
    }
}

