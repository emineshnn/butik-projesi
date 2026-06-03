package org.example.butikprojesi.repository;

import org.example.butikprojesi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByPriceBetween(
            BigDecimal minPrice,
            BigDecimal maxPrice
    );

    List<Product> findByBrand_Name(String brandName);

    List<Product> findByCategory_Name(String categoryName);

    List<Product> findByStockGreaterThan(Integer stock);
}
