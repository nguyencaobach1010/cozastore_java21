package com.cybersoft.coza_store21.entity;

import javax.persistence.*;

@Entity(name = "TAG")
public class TagEntity {
    @Id
    @ManyToOne
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BlogTagEntity Id;

    @Column(name = "name")
    private String name;

    public BlogTagEntity getId() {
        return Id;
    }

    public void setId(BlogTagEntity id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
