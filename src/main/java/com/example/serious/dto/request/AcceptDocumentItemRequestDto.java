package com.example.serious.dto.request;

import com.example.serious.dto.response.AcceptDocumentResponseDto;
import com.example.serious.dto.response.ProductResponseDto;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AcceptDocumentItemRequestDto {
    private AcceptDocumentResponseDto dto;
    private ProductResponseDto productResponseDto;
    private Double camePrice;
    private Double count;
}
