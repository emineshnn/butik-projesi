package org.example.butikprojesi.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.butikprojesi.dto.ProductRequestDto;
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
    public Product createProduct(@Valid @RequestBody ProductRequestDto productRequestDto) {

        Product product = Product.builder()
                .productName(productRequestDto.getProductName())
                .description(productRequestDto.getDescription())
                .price(productRequestDto.getPrice())
                .stock(productRequestDto.getStock())
                .imageUrl(productRequestDto.getImageUrl())
                .build();

        return productService.saveProduct(product);
    }

    @PutMapping("/api/products/{id}")
    public Product updateProduct(
            @PathVariable Long id,
            @RequestBody Product product) {

        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/api/products/{id}")
    public String deleteProduct(@PathVariable Long id) {

        productService.deleteProduct(id);

        return "Ürün silindi";
    }
}





