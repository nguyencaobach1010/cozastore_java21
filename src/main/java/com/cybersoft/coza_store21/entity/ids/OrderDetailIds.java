package com.cybersoft.coza_store21.entity.ids;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderDetailIds implements Serializable {

    @Column(name = "product_id")
    private int productId;

    @Column(name = "order_id")
    private int orderId;

    public OrderDetailIds(){}

    public OrderDetailIds(int productId, int orderId){
        this.productId = productId;
        this.orderId = orderId;
    }
}
