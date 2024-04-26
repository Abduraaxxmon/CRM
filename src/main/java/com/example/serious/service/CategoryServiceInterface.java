package com.example.serious.service;

import com.example.serious.dto.request.CategoryRequestDto;
import com.example.serious.dto.request.ProductRequestDto;
import com.example.serious.dto.response.CategoryResponseDto;
import com.example.serious.dto.response.ProductResponseDto;

import java.util.List;

public interface CategoryServiceInterface {
    CategoryResponseDto getById(Long id);
    CategoryResponseDto updateBYId(Long id, CategoryRequestDto categoryRequestDto);
    CategoryResponseDto create(CategoryRequestDto categoryRequestDto);
    List<CategoryResponseDto> getAll();
    void deleteById(Long id);
}
