package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private Integer score;
    private Long userId;

    //Many comments may be on one product
    @ManyToOne
    @JoinColumn(name="product_id", nullable = false)
    private Product product;

    //Many comments may be from one user
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
