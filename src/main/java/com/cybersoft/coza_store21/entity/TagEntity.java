package com.cybersoft.coza_store21.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "tag")
public class TagEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "tag")
    private Set<CategoryTag> categoryTags;

    @OneToMany(mappedBy = "tag")
    private Set<TagBlogEntity> tagBlogs;
}
