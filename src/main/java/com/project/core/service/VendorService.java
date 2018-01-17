package com.project.core.service;

import com.project.core.domain.Vendor;

public interface VendorService {

    Vendor getById(Long id);
    
    Vendor saveVendor(Vendor vendor);

	Vendor findByUsername(String username, String password);

	Vendor updateVendor(Vendor vendor);
}
