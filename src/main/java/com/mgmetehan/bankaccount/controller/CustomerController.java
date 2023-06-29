package com.mgmetehan.bankaccount.controller;

import com.mgmetehan.bankaccount.service.CustomerService;
import com.mgmetehan.bankaccount.shared.endpoints.CustomerEndpoints;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CustomerEndpoints.CUSTOMERS)
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;
}
