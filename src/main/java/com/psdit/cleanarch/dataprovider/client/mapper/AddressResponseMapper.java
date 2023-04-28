package com.psdit.cleanarch.dataprovider.client.mapper;

import com.psdit.cleanarch.core.domain.Address;
import com.psdit.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
