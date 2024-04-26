package com.example.serious.dto.request;

import com.example.serious.dto.response.OrganizationResponseDto;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AcceptDocumentRequestDto {
    private OrganizationResponseDto dto;

}
