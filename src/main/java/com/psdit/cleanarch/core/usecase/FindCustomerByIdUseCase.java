package com.psdit.cleanarch.core.usecase;

import com.psdit.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);
}
