package com.theironyard;

/**
 * Created by admin on 6/13/16.
 */
public class ShippingAddress {

    String shipFromStreetAddress;
    String shipFromCity;
    String shipFromState;
    String shipFromZipCode;

    String shipToStreetAddress;
    String shipToCity;
    String shipToState;
    String shipToZipCode;

    public ShippingAddress(String shipFromStreetAddress, String shipFromCity, String shipFromState, String shipFromZipCode, String shipToStreetAddress, String shipToCity, String shipToState, String shipToZipCode) {
        this.shipFromStreetAddress = shipFromStreetAddress;
        this.shipFromCity = shipFromCity;
        this.shipFromState = shipFromState;
        this.shipFromZipCode = shipFromZipCode;
        this.shipToStreetAddress = shipToStreetAddress;
        this.shipToCity = shipToCity;
        this.shipToState = shipToState;
        this.shipToZipCode = shipToZipCode;
    }

    public String getShipFromStreetAddress() {
        return shipFromStreetAddress;
    }

    public void setShipFromStreetAddress(String shipFromStreetAddress) {
        this.shipFromStreetAddress = shipFromStreetAddress;
    }

    public String getShipFromCity() {
        return shipFromCity;
    }

    public void setShipFromCity(String shipFromCity) {
        this.shipFromCity = shipFromCity;
    }

    public String getShipFromState() {
        return shipFromState;
    }

    public void setShipFromState(String shipFromState) {
        this.shipFromState = shipFromState;
    }

    public String getShipFromZipCode() {
        return shipFromZipCode;
    }

    public void setShipFromZipCode(String shipFromZipCode) {
        this.shipFromZipCode = shipFromZipCode;
    }

    public String getShipToCity() {
        return shipToCity;
    }

    public void setShipToCity(String shipToCity) {
        this.shipToCity = shipToCity;
    }

    public String getShipToStreetAddress() {
        return shipToStreetAddress;
    }

    public void setShipToStreetAddress(String shipToStreetAddress) {
        this.shipToStreetAddress = shipToStreetAddress;
    }

    public String getShipToState() {
        return shipToState;
    }

    public void setShipToState(String shipToState) {
        this.shipToState = shipToState;
    }

    public String getShipToZipCode() {
        return shipToZipCode;
    }

    public void setShipToZipCode(String shipToZipCode) {
        this.shipToZipCode = shipToZipCode;
    }
}