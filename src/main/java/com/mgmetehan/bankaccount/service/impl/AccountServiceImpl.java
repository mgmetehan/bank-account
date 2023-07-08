package com.mgmetehan.bankaccount.service.impl;

import com.mgmetehan.bankaccount.converter.AccountConverter;
import com.mgmetehan.bankaccount.model.Account;
import com.mgmetehan.bankaccount.model.Transaction;
import com.mgmetehan.bankaccount.repository.AccountRepository;
import com.mgmetehan.bankaccount.service.AccountService;
import com.mgmetehan.bankaccount.service.CustomerService;
import com.mgmetehan.bankaccount.shared.model.dto.AccountDto;
import com.mgmetehan.bankaccount.shared.model.resource.AccountResource;
import com.mgmetehan.bankaccount.shared.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Slf4j
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final CustomerService customerService;
    private final AccountConverter accountConverter;

    @Override
    public AccountResource save(AccountDto request) {
        var customer = customerService.findCustomerById(request.getCustomerId());

        var account = Account.builder()
                .customer(customer)
                .balance(request.getInitialCredit())
                .localDateTime(DateUtil.getCurrentLocalDateTime())
                .build();

        if (request.getInitialCredit().compareTo(BigDecimal.ZERO) > 0) {
            Transaction transaction = Transaction.builder()
                    .amount(request.getInitialCredit())
                    .transactionDate(DateUtil.getCurrentLocalDateTime())
                    .account(account)
                    .build();

            account.getTransaction().add(transaction);
        }
        return accountConverter.toResource(accountRepository.save(account));
    }

    @Override
    public AccountResource getAccount(String id) {
        var account = accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account not found"));
        return null;

    }
}
