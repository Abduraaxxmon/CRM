package com.example.serious.service.Impl;

import com.example.serious.dto.request.MeasurementRequestDto;
import com.example.serious.dto.request.ProductRequestDto;
import com.example.serious.dto.response.MeasurementResponseDto;
import com.example.serious.dto.response.ProductResponseDto;
import com.example.serious.entity.Measurement;
import com.example.serious.mapper.MeasurementMapper;
import com.example.serious.repository.MeasurementRepository;
import com.example.serious.service.MeasurementServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class MeasurementServiceImpl implements MeasurementServiceInterface {
    private final MeasurementRepository repository;
    private final MeasurementMapper mapper;

    @Override
    public MeasurementResponseDto getById(Long id) {
        return mapper
                .toDto(repository
                        .getReferenceById(id));
    }

    @Override
    public MeasurementResponseDto updateBYId(Long id, MeasurementRequestDto productRequestDto) {
        Measurement measurement = repository.getReferenceById(id);
        measurement.setName(productRequestDto.getName());
        return mapper.toDto(repository.save(measurement));
    }

    @Override
    public MeasurementResponseDto create(MeasurementRequestDto measurementRequestDto) {
        Measurement measurement = new Measurement();
        measurement.setName(measurement.getName());
        return mapper
                .toDto(repository
                        .save(measurement));
    }

    @Override
    public List<MeasurementResponseDto> getAll() {
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
