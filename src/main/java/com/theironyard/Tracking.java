package com.theironyard;


import javax.persistence.*;

/**
 * Created by admin on 6/9/16.
 */
@Entity
@Table(name= "trackedData")
public class Tracking {

    @Id
    @GeneratedValue
    int id;

    @Column
    private String trackingNumber;

    @Column(nullable =false)
    private String shippingCompany;

    @Column(nullable =false)
    private String shippersName;

    @Column(nullable =false)
    private String signedBy;

    @Column(nullable =false)
    private Boolean insured;

    @Column(nullable =false)
    private String shippedDate;

    @Column(nullable =false)
    private String deliverDate;

    public Tracking(String trackingNumber, String shippingCompany, String shippersName, String signedBy, Boolean insured, String shippedDate, String deliverDate) {
        this.trackingNumber = trackingNumber;
        this.shippingCompany = shippingCompany;
        this.shippersName = shippersName;
        this.signedBy = signedBy;
        this.insured = insured;
        this.shippedDate = shippedDate;
        this.deliverDate = deliverDate;
    }

    public Tracking() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getShippersName() {
        return shippersName;
    }

    public void setShippersName(String shippersName) {
        this.shippersName = shippersName;
    }

    public String getShippingCompany() {
        return shippingCompany;
    }

    public void setShippingCompany(String shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public String getSignedBy() {
        return signedBy;
    }

    public void setSignedBy(String signedBy) {
        this.signedBy = signedBy;
    }

    public String getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(String shippedDate) {
        this.shippedDate = shippedDate;
    }

    public Boolean getInsured() {
        return insured;
    }

    public void setInsured(Boolean insured) {
        this.insured = insured;
    }

    public String getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(String deliverDate) {
        this.deliverDate = deliverDate;
    }
}
