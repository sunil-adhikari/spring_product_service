package com.javaflux.restexample.service;

import com.javaflux.restexample.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    public List<Product> getAll();
}
