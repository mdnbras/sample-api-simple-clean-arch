package com.psdit.cleanarch.core.usecase.impl;

import com.psdit.cleanarch.core.dataprovider.FindCustomerById;
import com.psdit.cleanarch.core.domain.Customer;
import com.psdit.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {

    private final FindCustomerById findCustomerById;

    public FindCustomerByIdUseCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(String id) {
        return findCustomerById.find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
