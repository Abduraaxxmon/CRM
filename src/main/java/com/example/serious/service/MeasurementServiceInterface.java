package com.example.serious.service;

import com.example.serious.dto.request.MeasurementRequestDto;
import com.example.serious.dto.request.ProductRequestDto;
import com.example.serious.dto.response.MeasurementResponseDto;
import com.example.serious.dto.response.ProductResponseDto;

import java.util.List;

public interface MeasurementServiceInterface {
    MeasurementResponseDto getById(Long id);
    MeasurementResponseDto updateBYId(Long id, MeasurementRequestDto measurementRequestDto);
    MeasurementResponseDto create(MeasurementRequestDto measurementRequestDto);
    List<MeasurementResponseDto> getAll();
    void deleteById(Long id);
}
