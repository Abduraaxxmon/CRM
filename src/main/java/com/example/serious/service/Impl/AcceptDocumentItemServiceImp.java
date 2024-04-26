package com.example.serious.service.Impl;

import com.example.serious.dto.request.AcceptDocumentItemRequestDto;
import com.example.serious.dto.response.AcceptDocumentItemResponseDto;
import com.example.serious.entity.AcceptDocumentItem;
import com.example.serious.mapper.AcceptDocumentItemMapper;
import com.example.serious.repository.AcceptDocumentItemRepository;
import com.example.serious.repository.AcceptDocumentRepository;
import com.example.serious.repository.ProductRepository;
import com.example.serious.service.AcceptDocumentItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AcceptDocumentItemServiceImp implements AcceptDocumentItemService {
    private final AcceptDocumentItemRepository repository;
    private final AcceptDocumentItemMapper mapper;
    private final AcceptDocumentRepository acceptDocumentRepository;
    private final ProductRepository productRepository;


    @Override
    public AcceptDocumentItemResponseDto create(AcceptDocumentItemRequestDto dto) {
        AcceptDocumentItem item = new AcceptDocumentItem();
        item.setCamePrice(dto.getCamePrice());
        item.setCount(dto.getCount());
        item.setAcceptDocument(acceptDocumentRepository.getReferenceById(dto.getDto().getId()));
        item.setProduct(productRepository.getReferenceById(dto.getProductResponseDto().getId()));

        return mapper
                .toDto(repository
                        .save(item));

    }

    @Override
    public List<AcceptDocumentItemResponseDto> getAll() {
        return mapper
                .toDtoList(repository
                        .findAll());
    }

    @Override
    public AcceptDocumentItemResponseDto getById(Long id) {
        return mapper
                .toDto(repository
                        .getReferenceById(id));
    }

    @Override
    public AcceptDocumentItemResponseDto updateById(Long id, AcceptDocumentItemRequestDto dto) {
        AcceptDocumentItem item = repository.getReferenceById(id);
        item.setProduct(productRepository.getReferenceById(dto.getProductResponseDto().getId()));
        item.setAcceptDocument(acceptDocumentRepository.getReferenceById(dto.getDto().getId()));
        item.setCount(dto.getCount());
        item.setCamePrice(dto.getCamePrice());

        return mapper
                .toDto(repository
                        .save(item));
    }

    @Override
    public void deleteById(Long id) {
        repository
                .deleteById(id);
    }
}
