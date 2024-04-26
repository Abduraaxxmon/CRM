package com.example.serious.service;

import com.example.serious.dto.request.AcceptDocumentItemRequestDto;
import com.example.serious.dto.request.AcceptDocumentRequestDto;
import com.example.serious.dto.response.AcceptDocumentItemResponseDto;

import java.util.List;

public interface AcceptDocumentItemService {
    AcceptDocumentItemResponseDto create(AcceptDocumentItemRequestDto dto);

    List<AcceptDocumentItemResponseDto> getAll();
    AcceptDocumentItemResponseDto getById(Long id);
    AcceptDocumentItemResponseDto updateById(Long id,AcceptDocumentItemRequestDto dto);
    void deleteById(Long id);
}
