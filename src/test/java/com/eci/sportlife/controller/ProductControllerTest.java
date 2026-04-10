package com.eci.sportlife.controller;

import com.eci.sportlife.dto.response.ProductPageResponse;
import com.eci.sportlife.dto.response.ProductResponse;
import com.eci.sportlife.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.math.BigDecimal;
import java.util.Collections;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class ProductControllerTest {
    @Mock
    private ProductService productService;
    @InjectMocks
    private ProductController productController;
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(productController).build();
    }

    @Test
    void list_products_ok() throws Exception {
        ProductResponse response = ProductResponse.builder()
                .id(1L).name("Balón").category("futbol").price(BigDecimal.TEN).stock(5).status("ACTIVE").build();
        ProductPageResponse pageResponse = ProductPageResponse.builder()
                .content(Collections.singletonList(response))
                .totalElements(1)
                .page(0)
                .size(10)
                .build();
        when(productService.list(any(), any(), any(PageRequest.class))).thenReturn(pageResponse);
        mockMvc.perform(get("/api/v1/products"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.content[0].name").value("Balón"));
    }

    @Test
    void getById_found() throws Exception {
        ProductResponse response = ProductResponse.builder().id(2L).name("Guantes").category("accesorios").price(BigDecimal.ONE).stock(2).status("ACTIVE").build();
        when(productService.getById(2L)).thenReturn(response);
        mockMvc.perform(get("/api/v1/products/2"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Guantes"));
    }
}
