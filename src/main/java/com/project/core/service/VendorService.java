package com.project.core.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.project.core.domain.Product;
import com.project.core.domain.Vendor;
import com.project.core.dto.VendorDTO;
import com.project.core.dto.VendorPriceDTO;

@Component
public interface VendorService {

    VendorDTO getById(Long id);
    
    VendorDTO saveVendor(VendorDTO obj);

	VendorDTO findByUsername(String username, String password);

	Vendor updateVendor(Vendor vendor);

	List<VendorPriceDTO> getBySearchOnId(Long id);
}
