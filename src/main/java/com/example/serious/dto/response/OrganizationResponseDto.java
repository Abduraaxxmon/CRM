package com.example.serious.dto.response;

import com.example.serious.entity.AcceptDocument;
import lombok.*;

import java.util.List;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class OrganizationResponseDto {
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
}
