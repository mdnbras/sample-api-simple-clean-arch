package com.psdit.cleanarch.dataprovider.repository.mapper;

import com.psdit.cleanarch.core.domain.Customer;
import com.psdit.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
