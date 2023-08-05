package com.mitocode.service;

import com.mitocode.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();
    Product findById(int id);
    int deleteBydId(int id);
    int save(Product item);
    int update(int id, Product item);
}
