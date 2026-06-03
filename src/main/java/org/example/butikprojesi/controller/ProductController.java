package org.example.butikprojesi.controller;

import lombok.RequiredArgsConstructor;
import org.example.butikprojesi.entity.Product;
import org.example.butikprojesi.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/api/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/api/products")
    public Product createProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
}