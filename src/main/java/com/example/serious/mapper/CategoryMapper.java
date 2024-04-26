package com.example.serious.mapper;

import com.example.serious.dto.response.CategoryResponseDto;
import com.example.serious.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper extends Maptruct<CategoryResponseDto, Category> {
}
