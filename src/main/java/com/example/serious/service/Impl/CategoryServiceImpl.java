package com.example.serious.service.Impl;

import com.example.serious.dto.request.CategoryRequestDto;
import com.example.serious.dto.response.CategoryResponseDto;
import com.example.serious.entity.Category;
import com.example.serious.mapper.CategoryMapper;
import com.example.serious.repository.CategoryRepository;
import com.example.serious.service.CategoryServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl  implements CategoryServiceInterface {
    private final CategoryRepository repository;
    private final CategoryMapper mapper;


    @Override
    public CategoryResponseDto getById(Long id) {
        return mapper.toDto(repository.getReferenceById(id));
    }

    @Override
    public CategoryResponseDto updateBYId(Long id, CategoryRequestDto categoryRequestDto) {
        Category category = repository.getReferenceById(id);
        category.setName(categoryRequestDto.getName());
        return mapper.toDto(repository.save(category));
    }

    @Override
    public CategoryResponseDto create(CategoryRequestDto categoryRequestDto) {
        Category category = new Category();
        category.setName(categoryRequestDto.getName());

        return mapper.toDto(repository
                .save(category));
    }

    @Override
    public List<CategoryResponseDto> getAll() {
        return mapper
                .toDtoList(repository
                        .findAll());
    }

    @Override
    public void deleteById(Long id) {
        repository
                .deleteById(id);
    }
}
