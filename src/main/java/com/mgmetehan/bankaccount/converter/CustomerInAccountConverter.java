package com.mgmetehan.bankaccount.converter;

import com.mgmetehan.bankaccount.model.Account;
import com.mgmetehan.bankaccount.shared.model.resource.CustomerInAccountResource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CustomerInAccountConverter {
    private final TransactionConverter transactionConverter;

    public CustomerInAccountResource toResource(Account account) {
        CustomerInAccountResource customerInAccountResource = new CustomerInAccountResource();
        customerInAccountResource.setId(account.getId());
        customerInAccountResource.setBalance(account.getBalance());
        customerInAccountResource.setTransactions(account.getTransaction()
                .stream()
                .map(transactionConverter::toResource)
                .collect(Collectors.toSet()));

        return customerInAccountResource;
    }
}
