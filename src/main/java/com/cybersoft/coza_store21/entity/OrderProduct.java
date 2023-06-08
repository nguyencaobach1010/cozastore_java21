package com.cybersoft.coza_store21.entity;

import javax.persistence.*;

@Entity(name = "ORDER_PRODUCT")
public class OrderProduct {

    @Id
    @ManyToOne
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private OrderEntity order_id;

    @Id
    @ManyToOne
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ProductEntity product_id;

    @Column(name = "quantity")
    private int quantity;

    public OrderEntity getOrder_id() {
        return order_id;
    }

    public void setOrder_id(OrderEntity order_id) {
        this.order_id = order_id;
    }

    public ProductEntity getProduct_id() {
        return product_id;
    }

    public void setProduct_id(ProductEntity product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
