package com.eci.sportlife.repository;

import com.eci.sportlife.model.Cart;
import com.eci.sportlife.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Optional<Cart> findByUser(User user);
}

