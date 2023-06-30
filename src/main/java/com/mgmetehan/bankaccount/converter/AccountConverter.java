package com.mgmetehan.bankaccount.converter;

import com.mgmetehan.bankaccount.model.Account;
import com.mgmetehan.bankaccount.shared.model.resource.AccountResource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class AccountConverter {
    private final CustomerConverter customerConverter;
    private final TransactionConverter transactionConverter;

    public AccountResource toResource(Account request) {
        AccountResource accountResource = new AccountResource();
        accountResource.setId(request.getId());
        accountResource.setBalance(request.getBalance());
        accountResource.setCreationDate(request.getLocalDateTime());
        accountResource.setCustomer(customerConverter.accountOwnerCustomerToResource(Optional.ofNullable(request.getCustomer())));
        accountResource.setTransactions(request.getTransaction()
                .stream()
                .map(transactionConverter::toResource)
                .collect(java.util.stream.Collectors.toSet()));

        return accountResource;
    }
}
