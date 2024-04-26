package com.example.serious.controller;

import com.example.serious.dto.request.CategoryRequestDto;
import com.example.serious.dto.request.MeasurementRequestDto;
import com.example.serious.dto.response.MeasurementResponseDto;
import com.example.serious.service.MeasurementServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/manage/Measurement")
public class MeasurementController {
    private final MeasurementServiceInterface service;

    @GetMapping("/{id}")
    public MeasurementResponseDto getById(@PathVariable Long id){
        return service
                .getById(id);
    }
    @GetMapping
    public List<MeasurementResponseDto> getAll(){
        return service
                .getAll();

    }
    @PutMapping
    public MeasurementResponseDto create(@RequestBody MeasurementRequestDto dto){
        return service
                .create(dto);

    }
    @PostMapping("/{id}")
    public MeasurementResponseDto updateById(@PathVariable Long id, @RequestBody MeasurementRequestDto measurementRequestDto){
        return service
                .updateBYId(id,measurementRequestDto);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        service
                .deleteById(id);
    }
}
