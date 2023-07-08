package com.mgmetehan.bankaccount.service.impl;

import com.mgmetehan.bankaccount.converter.CustomerConverter;
import com.mgmetehan.bankaccount.model.Customer;
import com.mgmetehan.bankaccount.repository.CustomerRepository;
import com.mgmetehan.bankaccount.service.CustomerService;
import com.mgmetehan.bankaccount.shared.model.resource.CustomerResource;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerConverter customerConverter;

    public Customer findCustomerById(String id) {
        return customerRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Customer not found"));

    }

    @Override
    public CustomerResource getCustomerById(String id) {
        var customer = findCustomerById(id);
        return customerConverter.toResource(customer);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}
