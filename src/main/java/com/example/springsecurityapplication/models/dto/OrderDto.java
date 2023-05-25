package com.example.springsecurityapplication.models.dto;

import com.example.springsecurityapplication.models.Order;
import com.example.springsecurityapplication.models.Product;

import java.util.ArrayList;
import java.util.List;

public class OrderDto {

    private Order order;

    private List<Product> products = new ArrayList<>();

    public Order getOrder() {
        return order;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setOrder(Order order) {
        this.order = order;
    }


    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }
}
