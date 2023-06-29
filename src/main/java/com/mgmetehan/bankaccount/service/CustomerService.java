package com.mgmetehan.bankaccount.service;

import com.mgmetehan.bankaccount.model.Customer;

public interface CustomerService {
    Customer findCustomerById(String id);
}
