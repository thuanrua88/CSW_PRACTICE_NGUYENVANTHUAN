package com.example.crudauthencustomer.service;

import com.example.crudauthencustomer.Models.Product;

import java.util.List;

public interface ProductService {
    public List<Product> listAll();

    public Product Create(Product theEmployee);

    public Product getById(Long id);

    public Product update(Long id, Product theEmployee);

    public Product save(Product theEmployee);

    public void deletebyId(Long theId);
}
