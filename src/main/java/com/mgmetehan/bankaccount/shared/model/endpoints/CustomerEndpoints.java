package com.mgmetehan.bankaccount.shared.model.endpoints;

import com.mgmetehan.bankaccount.core.endpoints.BaseEndpoints;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CustomerEndpoints extends BaseEndpoints {
    public static final String CUSTOMERS = BASE + "/customers";
}
