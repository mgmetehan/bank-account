package com.mgmetehan.bankaccount.converter;

import com.mgmetehan.bankaccount.model.Account;
import com.mgmetehan.bankaccount.shared.model.resource.AccountResource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccountConverter {
    private final CustomerConverter customerConverter;

    public AccountResource toResource(Account request) {
        AccountResource accountResource = new AccountResource();
        accountResource.setId(request.getId());
        accountResource.setBalance(request.getBalance());
        accountResource.setCreationDate(request.getLocalDateTime());
        accountResource.setCustomer();

        return null;
    }
}
