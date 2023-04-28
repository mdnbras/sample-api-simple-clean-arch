package com.psdit.cleanarch.core.dataprovider;

import com.psdit.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {
    Address find(final String zipCode);
}
