package com.mgmetehan.bankaccount.shared.model.resource;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@ToString
public class AccountResource {
    private String id;
    private BigDecimal balance;
    private LocalDateTime creationDate;
    private AccountOwnerResource customer;
    private Set<TransactionResource> transactions;
}
