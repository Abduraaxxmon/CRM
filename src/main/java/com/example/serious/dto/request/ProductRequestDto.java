package com.example.serious.dto.request;

import com.example.serious.dto.response.CategoryResponseDto;
import com.example.serious.dto.response.MeasurementResponseDto;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductRequestDto {
    private String name;
    private Double amount;
    private CategoryResponseDto category;
    private MeasurementResponseDto measurement;
}
