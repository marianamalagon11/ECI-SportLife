package com.eci.sportlife.dto.response;

import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class OrderResponse {
    private Long orderId;
    private String transactionId;
    private String status;
    private BigDecimal total;
    private String message;
    private List<OrderItemDTO> items;
    private LocalDateTime createdAt;
}

