package com.mgmetehan.bankaccount.controller;

import com.mgmetehan.bankaccount.model.Customer;
import com.mgmetehan.bankaccount.service.CustomerService;
import com.mgmetehan.bankaccount.shared.endpoints.CustomerEndpoints;
import com.mgmetehan.bankaccount.shared.model.resource.CustomerResource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CustomerEndpoints.CUSTOMERS)
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/{id}")
    public CustomerResource getCustomerById(@PathVariable String id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
}
