package com.psdit.cleanarch.core.usecase;

import com.psdit.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);
}
