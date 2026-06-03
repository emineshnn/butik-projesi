package org.example.butikprojesi.service;

import lombok.RequiredArgsConstructor;
import org.example.butikprojesi.entity.Product;
import org.example.butikprojesi.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
