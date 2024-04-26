package com.example.serious.dto.response;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AcceptDocumentItemResponseDto {
    private Long id ;
    private AcceptDocumentResponseDto dto;
    private ProductResponseDto productResponseDto;
    private Double camePrice;
    private Double count;

}
