package com.example.serious.mapper;

import com.example.serious.dto.request.AcceptDocumentItemRequestDto;
import com.example.serious.dto.response.AcceptDocumentItemResponseDto;
import com.example.serious.dto.response.AcceptDocumentResponseDto;
import com.example.serious.entity.AcceptDocumentItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AcceptDocumentItemMapper  extends Maptruct<AcceptDocumentItemResponseDto, AcceptDocumentItem>{
}
