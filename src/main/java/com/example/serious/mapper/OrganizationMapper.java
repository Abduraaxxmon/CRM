package com.example.serious.mapper;

import com.example.serious.dto.response.OrganizationResponseDto;
import com.example.serious.entity.Organization;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface OrganizationMapper extends Maptruct<OrganizationResponseDto, Organization> {

}
