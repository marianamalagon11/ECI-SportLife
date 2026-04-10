package com.eci.sportlife.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "transactions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transaction {
    @Id
    private String id;
    private Long orderId;
    private Long userId;
    private String status;
    private String paymentMethod;
    private BigDecimal amount;
    private String currency = "COP";
    private ProviderResponse providerResponse;
    private List<TransactionItem> items;
    private Metadata metadata;
    private LocalDateTime createdAt = LocalDateTime.now();

    @Data
    @Builder
    public static class ProviderResponse {
        private String code;
        private String message;
        private String authorizationCode;
        private String bank;
    }

    @Data
    @Builder
    public static class TransactionItem {
        private Long productId;
        private String name;
        private Integer quantity;
        private BigDecimal subtotal;
    }

    @Data
    @Builder
    public static class Metadata {
        private String ip;
        private String userAgent;
    }
}

