package com.project.core.service.impl;

import com.project.core.domain.Vendor;
import com.project.core.repository.VendorRepository;
import com.project.core.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorServiceImpl implements VendorService {

    @Autowired
    VendorRepository vendorRepository;

    @Override
    public Vendor getById(Long id) {
        Vendor vendor = vendorRepository.getOne(id);
        return vendor;
    }
}
