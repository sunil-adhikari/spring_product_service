package com.javaflux.restexample.service;

import com.javaflux.restexample.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{


    @Override
    public List<Product> getAll() {
        List<Product> productList = new ArrayList<Product>();
        productList.add(Product.builder().id(1).name("Laptop").price(400000).build());
        productList.add(Product.builder().id(2).name("Mobile").price(200000).build());
        productList.add(Product.builder().id(3).name("IPod").price(300000).build());
        productList.add(Product.builder().id(4).name("Camera").price(450000).build());
        return productList;
    }
}
