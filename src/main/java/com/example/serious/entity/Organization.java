package com.example.serious.entity;

import com.sun.jdi.event.StepEvent;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "organizations")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name",unique = true,nullable = false)
    private String name;

    @Column(name = "address",unique = true,nullable = false)
    private String address;

    @Column(name = "phone_number",nullable = false,unique = true)
    private String phoneNumber;

    //todo connections
    @OneToMany(mappedBy = "organization",cascade = CascadeType.ALL)
    private Set<AcceptDocument> acceptDocumentSet;
}
