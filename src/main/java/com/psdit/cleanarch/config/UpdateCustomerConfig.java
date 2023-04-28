package com.psdit.cleanarch.config;

import com.psdit.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.psdit.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.psdit.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.psdit.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            FindAddressByZipCodeImpl findAddressByZipCode,
            UpdateCustomerImpl updateCustomer
    ) {
        return new UpdateCustomerUseCaseImpl(
                findCustomerByIdUseCase,
                findAddressByZipCode,
                updateCustomer
        );
    }
}
