package com.cybersoft.coza_store21.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "u_comment")
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "comment")
    private String comment;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "website")
    private String website;

    @ManyToOne
    @JoinColumn(name = "blog_id")
    private BlogEntity blog;
}
