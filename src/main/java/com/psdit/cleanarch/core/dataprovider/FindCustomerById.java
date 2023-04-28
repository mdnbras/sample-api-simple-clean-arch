package com.psdit.cleanarch.core.dataprovider;

import com.psdit.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {
    Optional<Customer> find(final String customerId);
}
