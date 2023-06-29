package com.mgmetehan.bankaccount.converter;

import com.mgmetehan.bankaccount.model.Account;
import com.mgmetehan.bankaccount.shared.model.resource.CustomerOwnedAccountResource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CustomerOwnedAccountConverter {
    private final TransactionConverter transactionConverter;

    public CustomerOwnedAccountResource toResource(Account request) {
        CustomerOwnedAccountResource customerOwnedAccountResource = new CustomerOwnedAccountResource();
        customerOwnedAccountResource.setId(request.getId());
        customerOwnedAccountResource.setBalance(request.getBalance());
        customerOwnedAccountResource.setTransactions(request.getTransaction().
                stream()
                .map(transactionConverter::toResource)
                .collect(Collectors.toSet()));
        customerOwnedAccountResource.setCreationDate(request.getLocalDateTime());

        return customerOwnedAccountResource;
    }
}
