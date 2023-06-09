package com.cybersoft.coza_store21.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;
@Entity(name = "u_order")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "date")
    private Date date;

    @OneToMany(mappedBy = "order")
    private Set<OrderDetailEntity> orderDetails;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private CountryEntity country;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
