package com.clement.service;

import com.clement.annotation.Call;

public class ProductService {

    private ProductService() {
    }

    public void addProduct() {
        System.out.println("adding product to DB");
    }

    @Call
    public void editProduct() {
        System.out.println("editing the product");
    }
}
