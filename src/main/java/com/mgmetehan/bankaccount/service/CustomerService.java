package com.mgmetehan.bankaccount.service;

import com.mgmetehan.bankaccount.model.Customer;
import com.mgmetehan.bankaccount.shared.model.resource.CustomerResource;

public interface CustomerService {
    Customer findCustomerById(String id);

    CustomerResource getCustomerById(String id);

    Customer save(Customer customer);
}
