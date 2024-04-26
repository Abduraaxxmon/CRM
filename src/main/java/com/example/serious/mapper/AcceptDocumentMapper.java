package com.example.serious.mapper;

import com.example.serious.dto.response.AcceptDocumentResponseDto;
import com.example.serious.entity.AcceptDocument;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface AcceptDocumentMapper extends Maptruct<AcceptDocumentResponseDto, AcceptDocument> {
}
