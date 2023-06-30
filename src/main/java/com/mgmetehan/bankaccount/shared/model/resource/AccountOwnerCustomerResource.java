package com.mgmetehan.bankaccount.shared.model.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AccountOwnerCustomerResource {
    private String id;
    private String name;
    private String surname;
}
