package com.example.serious.mapper;

import com.example.serious.dto.response.MeasurementResponseDto;
import com.example.serious.entity.Measurement;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MeasurementMapper extends Maptruct<MeasurementResponseDto, Measurement> {
}
