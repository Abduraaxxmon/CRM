package com.example.serious.mapper;

import com.example.serious.dto.response.ProductResponseDto;
import com.example.serious.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper extends Maptruct<ProductResponseDto, Product> {
}
