package org.example.butikprojesi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductRequestDto {

    @NotBlank
    private String productName;

    private String description;

    @Positive
    private BigDecimal price;

    @Positive
    private Integer stock;

    private String imageUrl;

    private Long categoryId;

    private Long brandId;

    private Long supplierId;
}
