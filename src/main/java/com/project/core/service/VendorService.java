package com.project.core.service;

import com.project.core.domain.Vendor;
import com.project.core.dto.VendorDTO;

public interface VendorService {

    Vendor getById(Long id);
    
    VendorDTO saveVendor(VendorDTO obj);

	Vendor findByUsername(String username, String password);

	Vendor updateVendor(Vendor vendor);
}
