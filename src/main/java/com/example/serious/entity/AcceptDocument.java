package com.example.serious.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "accept_documents")
public class AcceptDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "document_number",nullable = false,unique = true)
    private String documentNumber;

    @Column(name = "date",nullable = false)
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "organization_id",referencedColumnName = "id")
    private Organization organization;

    //todo connections
    @OneToMany(mappedBy = "acceptDocument",cascade = CascadeType.ALL)
    private Set<AcceptDocumentItem> acceptDocumentItems;

}
