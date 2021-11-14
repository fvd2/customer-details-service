package com.fvd2.customerdetailsservice.controller;

import com.fvd2.customerdetailsservice.model.Customer;
import com.fvd2.customerdetailsservice.services.CustomerService;
import lombok.AllArgsConstructor;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
@CrossOrigin
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Customer addCustomer(@RequestBody @Valid Customer customer) {
        return customerService.addCustomer(customer);
    }
}

