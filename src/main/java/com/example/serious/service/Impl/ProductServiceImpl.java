package com.example.serious.service.Impl;

import com.example.serious.dto.request.ProductRequestDto;
import com.example.serious.dto.response.ProductResponseDto;
import com.example.serious.entity.Product;
import com.example.serious.mapper.ProductMapper;
import com.example.serious.repository.CategoryRepository;
import com.example.serious.repository.MeasurementRepository;
import com.example.serious.repository.ProductRepository;
import com.example.serious.service.ProductServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductServiceInterface {

    private final ProductRepository repository;
    private final ProductMapper mapper;
    private final CategoryRepository categoryRepository;
    private final MeasurementRepository measurementRepository;


    @Override
    public ProductResponseDto getById(Long id) {
        return mapper.
                toDto(repository.
                        getReferenceById(id));
    }

    @Override
    public ProductResponseDto create(ProductRequestDto productRequestDto) {

        Product product= new Product();
        product.setName(productRequestDto.getName());
        product.setCategory(categoryRepository.getReferenceById(productRequestDto.getCategory().getId()));
        product.setMeasurement(measurementRepository.getReferenceById(productRequestDto.getMeasurement().getId()));
        product.setAmount(productRequestDto.getAmount());

        return mapper
                .toDto(repository
                    .save(product));
    }

    @Override
    public ProductResponseDto updateBYId(Long id, ProductRequestDto productRequestDto) {
        Product product= repository.findById(id).get();
        product.setAmount(productRequestDto.getAmount());
        product.setCategory(categoryRepository.getReferenceById(productRequestDto.getCategory().getId()));
        product.setMeasurement(measurementRepository.getReferenceById(productRequestDto.getMeasurement().getId()));
        product.setName(productRequestDto.getName());

        return mapper
                .toDto(repository
                        .save(product));
    }

    @Override
    public List<ProductResponseDto> getAll() {
        return mapper
                .toDtoList(repository
                .findAll());
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
