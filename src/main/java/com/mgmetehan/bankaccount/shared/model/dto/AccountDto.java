package com.mgmetehan.bankaccount.shared.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class AccountDto {
    @NotBlank
    private String customerId;

    @Min(0)
    private BigDecimal initialCredit;
}
