package com.eci.sportlife.service;

import com.eci.sportlife.dto.response.ProductPageResponse;
import com.eci.sportlife.dto.response.ProductResponse;
import com.eci.sportlife.model.Product;
import com.eci.sportlife.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public ProductPageResponse list(String category, String name, PageRequest pageRequest) {
        Page<Product> page;
        if (category != null && !category.isEmpty() && name != null && !name.isEmpty()) {
            page = productRepository.findByCategoryAndNameContainingIgnoreCase(category, name, pageRequest);
        } else if (category != null && !category.isEmpty()) {
            page = productRepository.findByCategory(category, pageRequest);
        } else if (name != null && !name.isEmpty()) {
            page = productRepository.findByNameContainingIgnoreCase(name, pageRequest);
        } else {
            page = productRepository.findAll(pageRequest);
        }
        return ProductPageResponse.builder()
                .content(page.map(product -> ProductResponse.builder()
                        .id(product.getId())
                        .name(product.getName())
                        .description(product.getDescription())
                        .category(product.getCategory())
                        .price(product.getPrice())
                        .stock(product.getStock())
                        .images(product.getImages())
                        .status(product.getStatus().name())
                        .build()).getContent())
                .totalElements(page.getTotalElements())
                .page(page.getNumber())
                .size(page.getSize())
                .build();
    }

    public ProductResponse getById(Long id) {
        Optional<Product> productOpt = productRepository.findById(id);
        Product product = productOpt.orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .category(product.getCategory())
                .price(product.getPrice())
                .stock(product.getStock())
                .images(product.getImages())
                .status(product.getStatus().name())
                .build();
    }
}
