package com.pavanu.sleuthzipkinexample.customerservice.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    public CustomerDTO getCustomer(String customerID) {
        LOGGER.info("Getting customer: {}", customerID);

        return new CustomerDTO(customerID);
    }
}
