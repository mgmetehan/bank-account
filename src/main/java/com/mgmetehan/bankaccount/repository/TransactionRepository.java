package com.mgmetehan.bankaccount.repository;

import com.mgmetehan.bankaccount.core.repository.BaseJpaRepository;
import com.mgmetehan.bankaccount.model.Transaction;

public interface TransactionRepository extends BaseJpaRepository<Transaction, String> {
}
