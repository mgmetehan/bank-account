package com.mgmetehan.bankaccount.service;

import com.mgmetehan.bankaccount.shared.model.dto.AccountDto;
import com.mgmetehan.bankaccount.shared.model.resource.AccountResource;

public interface AccountService {
    AccountResource save(AccountDto request);
}
