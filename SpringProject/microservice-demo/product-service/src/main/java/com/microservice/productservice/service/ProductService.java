package com.microservice.productservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservice.productservice.pojo.Product;
import com.microservice.productservice.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
