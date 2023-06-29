package com.mgmetehan.bankaccount.controller;

import com.mgmetehan.bankaccount.service.AccountService;
import com.mgmetehan.bankaccount.shared.model.endpoints.AccountEndpoints;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(AccountEndpoints.ACCOUNTS)
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;
}
