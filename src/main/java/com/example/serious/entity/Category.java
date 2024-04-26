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
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name",nullable = false,unique = true)
    private String name;

    //TODO connections
    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private Set<Product> products;
}
