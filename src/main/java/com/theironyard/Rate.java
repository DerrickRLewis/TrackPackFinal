package com.theironyard;

import javax.persistence.*;

/**
 * Created by admin on 6/13/16.
 */
@Entity
@Table(name="ratesData")
public class Rate {


    @Id
    @GeneratedValue
    int id;

    @Column
    private String slug;
    @Column
    private double shippingCost;
    @Column
    private String arrivalDate;


    public Rate(String slug, double shippingCost, String arrivalDate) {
        this.slug = slug;
        this.shippingCost = shippingCost;
        this.arrivalDate = arrivalDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
}
