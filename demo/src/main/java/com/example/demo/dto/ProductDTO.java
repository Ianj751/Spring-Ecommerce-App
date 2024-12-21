package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDTO {
    private Long id;
    @NotBlank(message = "Product name cannot be blank")
    private String name;
    @NotBlank(message = "Product description cannot be blank")
    private String description;
    @Positive(message = "Product price must be positive")
    private BigDecimal price;
    private Integer quantity;
    private List<CommentDTO> comments; //foreign key


}
