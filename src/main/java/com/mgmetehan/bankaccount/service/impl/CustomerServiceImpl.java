package com.mgmetehan.bankaccount.service.impl;

import com.mgmetehan.bankaccount.model.Customer;
import com.mgmetehan.bankaccount.repository.CustomerRepository;
import com.mgmetehan.bankaccount.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public Customer findCustomerById(String id) {
        return customerRepository.findById(id)
                .orElseThrow();
    }
}
