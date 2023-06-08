package com.cybersoft.coza_store21.entity;

import javax.persistence.*;

@Entity(name = "SIZE")
public class SizeEntity {

    @Id
    @OneToOne
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ProductEntity Id;

    @Column(name = "name")
    private String name;

    public ProductEntity getId() {
        return Id;
    }

    public void setId(ProductEntity id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
