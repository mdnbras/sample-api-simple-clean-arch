package com.psdit.cleanarch.config;

import com.psdit.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.psdit.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.psdit.cleanarch.dataprovider.InsertCustomerImpl;
import com.psdit.cleanarch.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer,
            SendCpfForValidationImpl sendCpfForValidation
    ) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer, sendCpfForValidation);
    }
}
