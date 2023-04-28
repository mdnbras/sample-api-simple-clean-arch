package com.psdit.cleanarch.config;

import com.psdit.cleanarch.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import com.psdit.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.psdit.cleanarch.dataprovider.DeleteCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {
    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            DeleteCustomerByIdImpl deleteCustomerById
    ) {
        return new DeleteCustomerByIdUseCaseImpl(
                findCustomerByIdUseCase,
                deleteCustomerById
        );
    }
}
