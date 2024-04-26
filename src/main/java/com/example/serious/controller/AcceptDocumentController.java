package com.example.serious.controller;

import com.example.serious.dto.request.AcceptDocumentRequestDto;
import com.example.serious.dto.response.AcceptDocumentResponseDto;
import com.example.serious.service.AcceptDocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/manage/acceptDocument")
@RequiredArgsConstructor
public class AcceptDocumentController {
    private final AcceptDocumentService service;
    @PutMapping
    public AcceptDocumentResponseDto create(@RequestBody AcceptDocumentRequestDto dto){
        return service
                .create(dto);
    }
    @GetMapping
    public List<AcceptDocumentResponseDto> getAll(){
        return service
                .getAll();
    }
    @GetMapping("/{id}")
    public AcceptDocumentResponseDto getById(@PathVariable Long id){
        return service
                .getById(id);

    }
    @PostMapping("/{id}")
    public AcceptDocumentResponseDto update(@PathVariable Long id, @RequestBody AcceptDocumentRequestDto dto){
        return service
                .updateById(id,dto);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id){
        service
                .deleteById(id);
    }
}
