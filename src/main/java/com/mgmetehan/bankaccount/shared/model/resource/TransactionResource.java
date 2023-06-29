package com.mgmetehan.bankaccount.shared.model.resource;

import com.mgmetehan.bankaccount.core.model.type.TransactionType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class TransactionResource {
    private String id;
    private TransactionType type = TransactionType.INITAL;
    private BigDecimal amount;
    private LocalDateTime transactionDate;
}
