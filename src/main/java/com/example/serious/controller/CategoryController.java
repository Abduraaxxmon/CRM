package com.example.serious.controller;

import com.example.serious.dto.request.CategoryRequestDto;
import com.example.serious.dto.request.ProductRequestDto;
import com.example.serious.dto.response.CategoryResponseDto;
import com.example.serious.service.CategoryServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/manage/Category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryServiceInterface service;

    @GetMapping("/{id}")
    public CategoryResponseDto getById(@PathVariable Long id){
        return service
                .getById(id);
    }
    @GetMapping
    public List<CategoryResponseDto> getAll(){
        return service
                .getAll();

    }
    @PutMapping
    public CategoryResponseDto create(@RequestBody CategoryRequestDto dto){
        return service
                .create(dto);

    }
    @PostMapping("/{id}")
    public CategoryResponseDto updateById(@PathVariable Long id, @RequestBody CategoryRequestDto categoryRequestDto){
        return service
                .updateBYId(id,categoryRequestDto);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        service
                .deleteById(id);
    }
}
