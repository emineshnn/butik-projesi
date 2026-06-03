package org.example.butikprojesi.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductResponseDto {

    private Long id;

    private String productName;

    private String description;

    private BigDecimal price;

    private Integer stock;

    private String imageUrl;

    private String categoryName;

    private String brandName;

    private String supplierName;
}
