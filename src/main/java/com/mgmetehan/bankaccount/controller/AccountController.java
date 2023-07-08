package com.mgmetehan.bankaccount.controller;

import com.mgmetehan.bankaccount.service.AccountService;
import com.mgmetehan.bankaccount.shared.endpoints.AccountEndpoints;
import com.mgmetehan.bankaccount.shared.model.dto.AccountDto;
import com.mgmetehan.bankaccount.shared.model.resource.AccountResource;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(AccountEndpoints.ACCOUNTS)
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @PostMapping
    public AccountResource save(@Valid @RequestBody AccountDto request) {
        return accountService.save(request);
    }

    @GetMapping("/{id}")
    public AccountResource getAccount(@PathVariable("id") String id) {
        return accountService.getAccount(id);
    }
}
