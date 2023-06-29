package com.mgmetehan.bankaccount.service.impl;

import com.mgmetehan.bankaccount.repository.AccountRepository;
import com.mgmetehan.bankaccount.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
}
