package com.example.serious.dto.request;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class OrganizationRequestDto {
    private String name;
    private String address;
    private String phoneNumber;
}
