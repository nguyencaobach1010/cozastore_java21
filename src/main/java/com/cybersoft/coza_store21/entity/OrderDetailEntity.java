package com.cybersoft.coza_store21.entity;

import com.cybersoft.coza_store21.entity.ids.OrderDetailIds;

import javax.persistence.*;

@Entity(name = "order_detail")
public class OrderDetailEntity {

    @EmbeddedId
    OrderDetailIds ids;

    @Column(name = "price")
    private double price;

    @Column(name = "quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false,updatable = false)
    private ProductEntity product;

    @ManyToOne
    @JoinColumn(name = "order_id", insertable = false,updatable = false)
    private OrderEntity order;
}
