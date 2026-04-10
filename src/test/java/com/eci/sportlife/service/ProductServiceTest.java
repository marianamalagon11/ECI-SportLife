package com.eci.sportlife.service;

import com.eci.sportlife.dto.response.ProductPageResponse;
import com.eci.sportlife.dto.response.ProductResponse;
import com.eci.sportlife.model.Product;
import com.eci.sportlife.model.ProductStatus;
import com.eci.sportlife.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProductServiceTest {
    @Mock
    private ProductRepository productRepository;
    @InjectMocks
    private ProductService productService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void list_allProducts() {
        Product product = Product.builder()
                .id(1L)
                .name("Balón")
                .description("Balón de fútbol")
                .category("futbol")
                .price(BigDecimal.valueOf(100))
                .stock(10)
                .images(Collections.singletonList("img.jpg"))
                .status(ProductStatus.ACTIVE)
                .build();
        Page<Product> page = new PageImpl<>(Collections.singletonList(product));
        when(productRepository.findAll(any(PageRequest.class))).thenReturn(page);
        ProductPageResponse result = productService.list(null, null, PageRequest.of(0, 10));
        assertEquals(1, result.getTotalElements());
        assertEquals("Balón", result.getContent().get(0).getName());
    }

    @Test
    void list_byCategory() {
        Product product = Product.builder().id(2L).name("Camiseta").category("ropa").price(BigDecimal.TEN).stock(5).status(ProductStatus.ACTIVE).build();
        Page<Product> page = new PageImpl<>(Collections.singletonList(product));
        when(productRepository.findByCategory(eq("ropa"), any(PageRequest.class))).thenReturn(page);
        ProductPageResponse result = productService.list("ropa", null, PageRequest.of(0, 10));
        assertEquals(1, result.getTotalElements());
        assertEquals("Camiseta", result.getContent().get(0).getName());
    }

    @Test
    void getById_found() {
        Product product = Product.builder().id(3L).name("Guantes").category("accesorios").price(BigDecimal.ONE).stock(2).status(ProductStatus.ACTIVE).build();
        when(productRepository.findById(3L)).thenReturn(Optional.of(product));
        ProductResponse response = productService.getById(3L);
        assertEquals("Guantes", response.getName());
    }

    @Test
    void getById_notFound() {
        when(productRepository.findById(99L)).thenReturn(Optional.empty());
        assertThrows(RuntimeException.class, () -> productService.getById(99L));
    }
}
