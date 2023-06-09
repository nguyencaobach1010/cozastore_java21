package com.cybersoft.coza_store21.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "category")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "category")
    private Set<CategoryTag> categoryTags;

    @OneToMany(mappedBy = "category")
    private Set<ProductEntity> products;
}
