package com.fvd2.customerdetailsservice.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class ContactDetails {
    @Email
    private String email;

    @NotBlank
    private String phoneNumber;

    public ContactDetails(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
