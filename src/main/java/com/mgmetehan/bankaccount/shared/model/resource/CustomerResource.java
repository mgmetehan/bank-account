package com.mgmetehan.bankaccount.shared.model.resource;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString
public class CustomerResource {
    private String id;
    private String name;
    private String surname;
    private Set<CustomerOwnedAccountResource> accounts;
}
