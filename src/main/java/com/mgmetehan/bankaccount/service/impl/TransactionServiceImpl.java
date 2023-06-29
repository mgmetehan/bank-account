package com.mgmetehan.bankaccount.service.impl;

import com.mgmetehan.bankaccount.repository.TransactionRepository;
import com.mgmetehan.bankaccount.service.TransactionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;
}
