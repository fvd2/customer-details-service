package com.fvd2.customerdetailsservice.controller;

import com.fvd2.customerdetailsservice.model.Customer;
import com.fvd2.customerdetailsservice.model.ErrorObject;
import com.fvd2.customerdetailsservice.services.CustomerService;
import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;



@RestController
@RequestMapping(CustomerController.endpoint)
@CrossOrigin
@AllArgsConstructor
public class CustomerController {
    public static final String endpoint = "v1/customers";
    private CustomerService customerService;

    @GetMapping
    public ResponseEntity<Object> getCustomers() {
        try {
            return new ResponseEntity<>(customerService.getCustomers(), HttpStatus.OK);
        } catch (Exception err) {
            return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(new ErrorObject(HttpStatus.SERVICE_UNAVAILABLE.value(), err.toString(), endpoint));
        }
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Object> addCustomer(@RequestBody @Valid Customer customer) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(customerService.addCustomer(customer));
        } catch (Exception err) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorObject(HttpStatus.BAD_REQUEST.value(), err.toString(), endpoint));
        }
    }
}


