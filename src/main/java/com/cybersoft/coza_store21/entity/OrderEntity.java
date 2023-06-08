package com.cybersoft.coza_store21.entity;

import javax.persistence.*;

@Entity(name = "ORDER")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "price")
    private long price;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private CountryEntity country_id;

    @Column(name = "state")
    private String state;

    @Column(name = "postcode")
    private int postcode;

    @ManyToOne
    @JoinColumn(name = "coupon_id")
    private CouponEntity coupon_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user_id;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public CountryEntity getCountry_id() {
        return country_id;
    }

    public void setCountry_id(CountryEntity country_id) {
        this.country_id = country_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public CouponEntity getCoupon_id() {
        return coupon_id;
    }

    public void setCoupon_id(CouponEntity coupon_id) {
        this.coupon_id = coupon_id;
    }

    public UserEntity getUser_id() {
        return user_id;
    }

    public void setUser_id(UserEntity user_id) {
        this.user_id = user_id;
    }
}
