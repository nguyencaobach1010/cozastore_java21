package com.cybersoft.coza_store21.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "blog")
public class BlogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "image")
    private String image;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "content")
    private String content;

    @Column(name = "create_date")
    private Date createDate;

    @OneToMany(mappedBy = "blog")
    private Set<TagBlogEntity> tagBlogs;

    @OneToMany(mappedBy = "blog")
    private Set<CommentEntity> comments;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
