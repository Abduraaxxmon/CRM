package com.example.serious.controller;

import com.example.serious.dto.request.ProductRequestDto;
import com.example.serious.dto.response.ProductResponseDto;
import com.example.serious.service.ProductServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/manage/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductServiceInterface service;

    @GetMapping("/{id}")
    public ProductResponseDto getById(@PathVariable Long id){
        return service
                .getById(id);
    }
    @GetMapping
    public List<ProductResponseDto> getAll(){
        return service
                .getAll();

    }
    @PutMapping
    public ProductResponseDto create(@RequestBody ProductRequestDto dto){
        return service
                .create(dto);

    }
    @PostMapping("/{id}")
    public ProductResponseDto updateById(@PathVariable Long id, @RequestBody ProductRequestDto productRequestDto){
        return service
                .updateBYId(id,productRequestDto);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        service
                .deleteById(id);
    }
}
