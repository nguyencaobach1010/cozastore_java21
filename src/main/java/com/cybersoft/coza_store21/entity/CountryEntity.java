package com.cybersoft.coza_store21.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "country")
public class CountryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "price_ship")
    private double priceShip;

    @OneToMany(mappedBy = "country")
    private Set<OrderEntity> orders;
}
