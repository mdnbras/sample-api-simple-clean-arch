package com.psdit.cleanarch.dataprovider;

import com.psdit.cleanarch.core.dataprovider.InsertCustomer;
import com.psdit.cleanarch.core.domain.Customer;
import com.psdit.cleanarch.dataprovider.repository.CustomerRepository;
import com.psdit.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerImpl implements InsertCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
