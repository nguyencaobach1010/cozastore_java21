package com.cybersoft.coza_store21.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "color")
public class ColorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "color")
    private Set<ProductEntity> products;
}
