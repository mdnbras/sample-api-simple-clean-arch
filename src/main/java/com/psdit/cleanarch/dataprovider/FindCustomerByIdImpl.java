package com.psdit.cleanarch.dataprovider;

import com.psdit.cleanarch.core.dataprovider.FindCustomerById;
import com.psdit.cleanarch.core.domain.Customer;
import com.psdit.cleanarch.dataprovider.repository.CustomerRepository;
import com.psdit.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdImpl implements FindCustomerById {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String customerId) {
        var customerEntity = customerRepository.findById(customerId);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
