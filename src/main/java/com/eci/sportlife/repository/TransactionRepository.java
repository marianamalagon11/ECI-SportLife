package com.eci.sportlife.repository;

import com.eci.sportlife.model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<Transaction, String> {
}

