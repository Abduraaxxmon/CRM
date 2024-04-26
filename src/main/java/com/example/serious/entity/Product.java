package com.example.serious.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name",nullable = false,unique = true)
    private String name;

    @Column(name = "amount",nullable = false)
    private Double amount;//how many came;

    @ManyToOne
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "measurement_id",referencedColumnName = "id")
    private Measurement measurement;

    //todo connections
    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    private Set<AcceptDocumentItem> acceptDocumentItems;
}
