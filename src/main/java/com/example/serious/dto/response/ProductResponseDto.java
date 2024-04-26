package com.example.serious.dto.response;

import com.example.serious.entity.Category;
import com.example.serious.entity.Measurement;
import jakarta.persistence.Entity;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponseDto {
    private Long id;
    private String name;
    private Double amount;
    private CategoryResponseDto category;
    private MeasurementResponseDto measurement;
}
