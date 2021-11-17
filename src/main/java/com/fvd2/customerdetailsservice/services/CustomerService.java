package com.fvd2.customerdetailsservice.services;

import com.fvd2.customerdetailsservice.model.Customer;
import com.fvd2.customerdetailsservice.model.Quote;
import com.fvd2.customerdetailsservice.model.QuoteResponse;
import com.fvd2.customerdetailsservice.model.QuoteResponseContent;
import com.fvd2.customerdetailsservice.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@AllArgsConstructor
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Customer addCustomer(Customer customer) {
        // request and - if available - set quote before inserting customer
        try {
            String uri = "https://quotes.rest/qod";
            RestTemplate restTemplate = new RestTemplate();
            QuoteResponse quoteResponse = restTemplate.getForObject(uri, QuoteResponse.class);
            if (quoteResponse != null) {
                customer.setQuote(quoteResponse.getQuoteResponseContent().getQuoteList().get(0));
            }
            return customerRepository.insert(customer);
        }
        catch (Exception err) {
            return customerRepository.insert(customer);
        }
    }

    public QuoteResponseContent addQuote(QuoteResponse contents) {
        return contents.getQuoteResponseContent();
    }
}
