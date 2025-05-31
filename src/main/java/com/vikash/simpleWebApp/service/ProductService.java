package com.vikash.simpleWebApp.service;

import com.vikash.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = Arrays.asList(new Product(101,"Iphone",50000),
            new Product(102,"Canon Camara",20000));
    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId) {

    }
}
