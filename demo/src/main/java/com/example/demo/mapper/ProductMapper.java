package com.example.demo.mapper;

import com.example.demo.dto.CommentDTO;
import com.example.demo.dto.ProductDTO;
import com.example.demo.model.Comment;
import com.example.demo.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(target = "image", source = "image")
    ProductDTO toDTO(Product product);

    @Mapping(target = "image", source = "image")
    Product toEntity(ProductDTO productDTO);

    @Mapping(target = "userId", source = "user.id")
    CommentDTO toDTO(Comment comment);

    @Mapping(target = "user.id", source = "UserId")
    Comment toEntity(CommentDTO commentDTO);
}
