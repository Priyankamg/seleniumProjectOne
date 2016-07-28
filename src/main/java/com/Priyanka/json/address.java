package com.Priyanka.json;

/**
 * Created by Priyanka on 7/27/2016.
 */
public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private int postalCode;

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity(){
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public int getPostalCode() {
        return postalCode;
    }
}
