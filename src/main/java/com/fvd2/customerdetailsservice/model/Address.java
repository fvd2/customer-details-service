package com.fvd2.customerdetailsservice.model;

import javax.validation.constraints.NotBlank;

public class Address {
    @NotBlank
    private String streetAndNumber;
    private String streetAdditional; // optional e.g. apartment number

    @NotBlank
    private String postalCode;

    @NotBlank
    private String country;

    public Address(String streetAndNumber, String streetAdditional, String postalCode, String country) {
        this.streetAndNumber = streetAndNumber;
        this.streetAdditional = streetAdditional;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public void setStreetAndNumber(String streetAndNumber) {
        this.streetAndNumber = streetAndNumber;
    }

    public String getStreetAdditional() {
        return streetAdditional;
    }

    public void setStreetAdditional(String streetAdditional) {
        this.streetAdditional = streetAdditional;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
