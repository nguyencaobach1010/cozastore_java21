package com.cybersoft.coza_store21.entity;

import javax.persistence.*;

@Entity(name = "PRODUCT")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private long price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category_id;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "size_id")
    private SizeEntity size_id;

    @ManyToOne
    @JoinColumn(name = "color_id")
    private ColorEntity color_id;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "list_image")
    private String list_image;

}
