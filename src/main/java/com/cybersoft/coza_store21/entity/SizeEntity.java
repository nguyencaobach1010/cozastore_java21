package com.cybersoft.coza_store21.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "size")
public class SizeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "size")
    private Set<ProductEntity> products;
}
