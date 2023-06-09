package com.cybersoft.coza_store21.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "user")
    private Set<BlogEntity> blogs;

    @OneToMany(mappedBy = "user")
    private Set<OrderEntity> orders;
}
