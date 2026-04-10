package com.eci.sportlife.repository;

import com.eci.sportlife.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductRepository extends JpaRepository<Product, Long> {
	Page<Product> findByCategory(String category, Pageable pageable);
	Page<Product> findByNameContainingIgnoreCase(String name, Pageable pageable);
	Page<Product> findByCategoryAndNameContainingIgnoreCase(String category, String name, Pageable pageable);
}

