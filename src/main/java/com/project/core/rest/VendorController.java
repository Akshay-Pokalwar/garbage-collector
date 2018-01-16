package com.project.core.rest;

import com.project.core.domain.Vendor;
import com.project.core.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendor")
public class VendorController {

    @Autowired
    VendorService vendorService;

    @GetMapping("/")
    Vendor getById(Long id){
        return vendorService.getById(id);
    }
}
