package com.project.core.service;

import org.springframework.stereotype.Component;

import com.project.core.domain.Vendor;
import com.project.core.dto.VendorDTO;

@Component
public interface VendorService {

    VendorDTO getById(Long id);
    
    VendorDTO saveVendor(VendorDTO obj);

	VendorDTO findByUsername(String username, String password);

	Vendor updateVendor(Vendor vendor);
}
