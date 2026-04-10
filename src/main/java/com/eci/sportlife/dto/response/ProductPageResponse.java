package com.eci.sportlife.dto.response;

import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class ProductPageResponse {
    private List<ProductResponse> content;
    private long totalElements;
    private int page;
    private int size;
}

