package com.fvd2.customerdetailsservice.repository;

import com.fvd2.customerdetailsservice.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
    // define custom queries here
}
