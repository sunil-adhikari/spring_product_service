package com.javaflux.restexample.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Product {
    private int id;
    private String name;
    private double price;
}
