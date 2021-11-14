package com.fvd2.customerdetailsservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteResponse {
    private QuoteResponseContent contents;

    public QuoteResponseContent getQuoteResponseContent() {
        return contents;
    }

    public void setContents(QuoteResponseContent contents) {
        this.contents = contents;
    }
}

