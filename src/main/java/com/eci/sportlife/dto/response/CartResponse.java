package com.eci.sportlife.dto.response;

import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class CartResponse {
    private Long id;
    private List<CartItemDTO> items;
    private String status;
    private BigDecimal total;
}

