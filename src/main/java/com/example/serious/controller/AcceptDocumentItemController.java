package com.example.serious.controller;

import com.example.serious.dto.request.AcceptDocumentItemRequestDto;
import com.example.serious.dto.response.AcceptDocumentItemResponseDto;
import com.example.serious.service.AcceptDocumentItemService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController
@RequestMapping("/api/v1/manage/acceptDocumentItem")
@RequiredArgsConstructor
public class AcceptDocumentItemController {
    private final AcceptDocumentItemService service;

    @PutMapping
    public AcceptDocumentItemResponseDto create(@RequestBody AcceptDocumentItemRequestDto dto){
        return service
                .create(dto);
    }
    @GetMapping
    public List<AcceptDocumentItemResponseDto> getAll(){
        return service
                .getAll();
    }
    @GetMapping("/{id}")
    public AcceptDocumentItemResponseDto getById(@PathVariable Long id){
        return service
                .getById(id);

    }
    @PostMapping("/{id}")
    public AcceptDocumentItemResponseDto update(@PathVariable Long id, @RequestBody AcceptDocumentItemRequestDto dto){
        return service
                .updateById(id,dto);

    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        service
                .deleteById(id);
    }
}
