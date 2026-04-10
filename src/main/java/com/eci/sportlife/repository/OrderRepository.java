package com.eci.sportlife.repository;

import com.eci.sportlife.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

