package com.example.serious.service;

import com.example.serious.dto.request.ProductRequestDto;
import com.example.serious.dto.response.ProductResponseDto;

import java.util.List;

public interface ProductServiceInterface {
    ProductResponseDto getById(Long id);
    ProductResponseDto create(ProductRequestDto  productRequestDto);
    ProductResponseDto updateBYId(Long id, ProductRequestDto productRequestDto);
    List<ProductResponseDto> getAll();
    void deleteById(Long id);

}
