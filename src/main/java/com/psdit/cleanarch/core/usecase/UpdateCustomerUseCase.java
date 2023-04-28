package com.psdit.cleanarch.core.usecase;

import com.psdit.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {
    void update(Customer customer, String zipCode);
}
