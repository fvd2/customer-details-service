package com.fvd2.customerdetailsservice.model;

import com.fvd2.customerdetailsservice.annotations.CreditCardExpirationDateValidation;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class PaymentDetails {
    @NotNull
    private PaymentMethod paymentMethod;

    @NotNull
    private long creditCardNumber;

    @NotBlank
    @CreditCardExpirationDateValidation
    private String creditCardExpirationDate;

    public PaymentDetails(PaymentMethod paymentMethod, long creditCardNumber, String creditCardExpirationDate) {
        this.paymentMethod = paymentMethod;
        this.creditCardNumber = creditCardNumber;
        this.creditCardExpirationDate = creditCardExpirationDate;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardExpirationDate() {
        return creditCardExpirationDate;
    }

    public void setCreditCardExpirationDate(String creditCardExpirationDate) {
        this.creditCardExpirationDate = creditCardExpirationDate;
    }
}
