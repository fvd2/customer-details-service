package com.fvd2.customerdetailsservice.model;

import org.springframework.data.annotation.Id;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

public class Customer {
    @Id
    private String id;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @Valid
    private Address address;

    @Valid
    private PaymentDetails paymentDetails;

    @Valid
    private ContactDetails contactDetails;

    private Quote quote;

    public Customer(String firstName, String lastName, Address address, PaymentDetails paymentDetails, ContactDetails contactDetails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.paymentDetails = paymentDetails;
        this.contactDetails = contactDetails;
        this.quote = new Quote();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }
}
