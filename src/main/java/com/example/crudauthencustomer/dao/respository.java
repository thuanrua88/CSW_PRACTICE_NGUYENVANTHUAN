package com.example.crudauthencustomer.dao;

import com.example.crudauthencustomer.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface respository extends JpaRepository<Product, Long> {
}
