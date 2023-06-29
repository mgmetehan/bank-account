package com.mgmetehan.bankaccount.converter;

import com.mgmetehan.bankaccount.model.Customer;
import com.mgmetehan.bankaccount.shared.model.resource.CustomerResource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CustomerConverter {
    private final CustomerOwnedAccountConverter customerOwnedAccountConverter;

    public CustomerResource toResource(Customer customer) {
        CustomerResource customerResource = new CustomerResource();
        customerResource.setId(customer.getId());
        customerResource.setName(customer.getName());
        customerResource.setSurname(customer.getSurname());
        customerResource.setAccounts(customer.getAccount()
                .stream()
                .map(customerOwnedAccountConverter::toResource)
                .collect(Collectors.toSet()));

        return customerResource;
    }
}
