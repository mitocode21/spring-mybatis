package com.mitocode.service;

import com.mitocode.mapper.ProductMapper;
import com.mitocode.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductMapper mapper;
  
    @Override
    public List<Product> findAll() {
        return mapper.findAll();
    }

    @Override
    public Product findById(int id) {
        return mapper.findById(id);
    }

    @Override
    public int deleteBydId(int id) {
        return mapper.deleteById(id);
    }

    @Override
    public int save(Product item) {
        return mapper.save(item);
    }

    @Override
    public int update(int id, Product item) {
        item.setId(id);
        return mapper.update(item);
    }
}
