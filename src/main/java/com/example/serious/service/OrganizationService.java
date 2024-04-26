package com.example.serious.service;

import com.example.serious.dto.request.OrganizationRequestDto;
import com.example.serious.dto.response.AcceptDocumentResponseDto;
import com.example.serious.dto.response.OrganizationResponseDto;

import java.util.List;

public interface OrganizationService {
    OrganizationResponseDto create(OrganizationRequestDto dto);
    OrganizationResponseDto getById(Long id);
    List<OrganizationResponseDto> getAll();

    OrganizationResponseDto updateById(Long id,OrganizationRequestDto dto);
    void deleteById(Long id);

}
