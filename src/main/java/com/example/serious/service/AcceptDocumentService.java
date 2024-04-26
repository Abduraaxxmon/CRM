package com.example.serious.service;

import com.example.serious.dto.request.AcceptDocumentRequestDto;
import com.example.serious.dto.request.OrganizationRequestDto;
import com.example.serious.dto.response.AcceptDocumentItemResponseDto;
import com.example.serious.dto.response.AcceptDocumentResponseDto;
import com.example.serious.dto.response.OrganizationResponseDto;

import java.util.List;

public interface AcceptDocumentService {
    AcceptDocumentResponseDto create(AcceptDocumentRequestDto dto);

    List<AcceptDocumentResponseDto> getAll();
    AcceptDocumentResponseDto getById(Long id);
    AcceptDocumentResponseDto updateById(Long id,AcceptDocumentRequestDto dto);

    void deleteById(Long id);
}
