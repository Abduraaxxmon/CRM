package com.example.serious.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "accept_document_items")
public class AcceptDocumentItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "came_price",nullable = false)
    private Double camePrice;

    @Column(name = "count",nullable = false)
    private Double count;

    @ManyToOne
    @JoinColumn(name = "accept_document_id",referencedColumnName = "id")
    private AcceptDocument acceptDocument;

    @ManyToOne
    @JoinColumn(name = "product_id",referencedColumnName = "id")
    private Product product;


}
