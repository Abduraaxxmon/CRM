package com.example.serious.dto.response;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AcceptDocumentResponseDto {
    private Long id ;
    private String docNumber;
    private OrganizationResponseDto dto;
    private LocalDate date;

}
