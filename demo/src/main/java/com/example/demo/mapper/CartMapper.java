package com.example.demo.mapper;

import com.example.demo.dto.CartDTO;
import com.example.demo.dto.CartItemDTO;
import com.example.demo.model.Cart;
import com.example.demo.model.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {

    @Mapping(target = "userId", source = "user.id")
    CartDTO toDTO(Cart cart);

    @Mapping(target = "user.id", source = "userId")
    CartDTO toEntity(CartDTO cartDTO);

    CartItemDTO toDTO(CartItem cartItem);

    @Mapping(target = "product.id", source = "productId")
    CartItem toEntity(CartItemDTO cartItemDTO);

}
