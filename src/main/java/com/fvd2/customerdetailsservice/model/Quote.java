package com.fvd2.customerdetailsservice.model;

public class Quote {
    private String quote;
    private String author;

    public Quote() {
        this.quote = "Carpe Diem";
        this.author = "Quintus Horatius Flaccus";
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}