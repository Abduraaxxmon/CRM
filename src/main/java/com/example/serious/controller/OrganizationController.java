package com.example.serious.controller;

import com.example.serious.dto.request.AcceptDocumentRequestDto;
import com.example.serious.dto.request.OrganizationRequestDto;
import com.example.serious.dto.response.AcceptDocumentResponseDto;
import com.example.serious.dto.response.OrganizationResponseDto;
import com.example.serious.service.OrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/manage/organization")
@RequiredArgsConstructor
public class OrganizationController {
    private final OrganizationService service;
    @PutMapping
    public OrganizationResponseDto create(@RequestBody OrganizationRequestDto dto){
        return service
                .create(dto);
    }
    @GetMapping
    public List<OrganizationResponseDto> getAll(){
        return service
                .getAll();
    }
    @GetMapping("/{id}")
    public OrganizationResponseDto getById(@PathVariable Long id){
        return service
                .getById(id);
    }
    @PostMapping("/{id}")
    public OrganizationResponseDto update(@PathVariable Long id,@RequestBody OrganizationRequestDto dto){
        return service
                .updateById(id,dto);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        service
                .deleteById(id);
    }
}
