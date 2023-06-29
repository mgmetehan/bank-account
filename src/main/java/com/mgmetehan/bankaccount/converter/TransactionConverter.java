package com.mgmetehan.bankaccount.converter;

import com.mgmetehan.bankaccount.model.Transaction;
import com.mgmetehan.bankaccount.shared.model.resource.TransactionResource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TransactionConverter {
    public TransactionResource toResource(Transaction request) {
        TransactionResource transactionResource = new TransactionResource();
        transactionResource.setId(request.getId());
        transactionResource.setType(request.getTransactionType());
        transactionResource.setAmount(request.getAmount());
        transactionResource.setTransactionDate(request.getTransactionDate());

        return transactionResource;
    }
}
