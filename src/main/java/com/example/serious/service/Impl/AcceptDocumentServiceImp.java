package com.example.serious.service.Impl;

import com.example.serious.dto.request.AcceptDocumentRequestDto;
import com.example.serious.dto.response.AcceptDocumentResponseDto;
import com.example.serious.entity.AcceptDocument;
import com.example.serious.mapper.AcceptDocumentMapper;
import com.example.serious.repository.AcceptDocumentRepository;
import com.example.serious.repository.OrganizationRepository;
import com.example.serious.service.AcceptDocumentService;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AcceptDocumentServiceImp implements AcceptDocumentService {
    private final AcceptDocumentRepository repository;
    private final AcceptDocumentMapper mapper;
    private final OrganizationRepository organizationRepository;

    @Override
    public AcceptDocumentResponseDto create(AcceptDocumentRequestDto dto) {
        AcceptDocument acceptDocument= new AcceptDocument();
        acceptDocument.setOrganization(organizationRepository.getReferenceById(dto.getDto().getId()));
        acceptDocument.setDocumentNumber(UUID.randomUUID().toString());

        return mapper
                .toDto(repository
                        .save(acceptDocument));
    }

    @Override
    public List<AcceptDocumentResponseDto> getAll() {
        return mapper
                .toDtoList(repository
                        .findAll());
    }

    @Override
    public AcceptDocumentResponseDto getById(Long id) {
        return mapper
                .toDto(repository
                        .getReferenceById(id));
    }

    @Override
    public AcceptDocumentResponseDto updateById(Long id, AcceptDocumentRequestDto dto) {
        AcceptDocument document= repository.getReferenceById(id);
        document.setOrganization(organizationRepository.getReferenceById(dto.getDto().getId()));

        return mapper
                .toDto(repository
                        .save(document));
    }

    @Override
    public void deleteById(Long id) {
        repository
                .deleteById(id);
    }
}
