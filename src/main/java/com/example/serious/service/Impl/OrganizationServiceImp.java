package com.example.serious.service.Impl;

import com.example.serious.dto.request.OrganizationRequestDto;
import com.example.serious.dto.response.OrganizationResponseDto;
import com.example.serious.entity.Organization;
import com.example.serious.mapper.OrganizationMapper;
import com.example.serious.repository.OrganizationRepository;
import com.example.serious.service.OrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrganizationServiceImp implements OrganizationService {
    private final OrganizationRepository repository;
    private final OrganizationMapper mapper;

    @Override
    public OrganizationResponseDto create(OrganizationRequestDto dto) {
        Organization organization= new Organization();
        organization.setName(dto.getName());
        organization.setAddress(dto.getAddress());
        organization.setPhoneNumber(dto.getPhoneNumber());

        return mapper
                .toDto(repository
                        .save(organization));
    }

    @Override
    public OrganizationResponseDto getById(Long id) {
        return mapper
                .toDto(repository
                        .getReferenceById(id));
    }

    @Override
    public List<OrganizationResponseDto> getAll() {
        return mapper
                .toDtoList(repository
                        .findAll());
    }

    @Override
    public OrganizationResponseDto updateById(Long id, OrganizationRequestDto dto) {
        Organization organization= repository.getReferenceById(id);
        organization.setName(dto.getName());
        organization.setAddress(dto.getAddress());
        organization.setPhoneNumber(dto.getPhoneNumber());

        return mapper
                .toDto(repository
                        .save(organization));
    }

    @Override
    public void deleteById(Long id) {
        repository
                .deleteById(id);
    }
}
