package com.project.core.service.impl;

import com.project.core.domain.User;
import com.project.core.domain.Vendor;
import com.project.core.repository.VendorRepository;
import com.project.core.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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

	@Override
	public Vendor saveVendor(Vendor vendor) {
		BCryptPasswordEncoder bc = new BCryptPasswordEncoder();
		String encPassword = bc.encode(vendor.getPassword());
		vendor.setPassword(encPassword);
		
		
		String encSecurity = bc.encode(vendor.getSecurityAns());
		vendor.setSecurityAns(encSecurity);
		
		Vendor v = vendorRepository.save(vendor);
		return v;

	}

	@Override
	public Vendor findByUsername(String username, String password) {
		System.err.println("USERNAME : " + username + "   PASSWORD: " + password);
		BCryptPasswordEncoder bc=new BCryptPasswordEncoder();
		
		Vendor vendor = vendorRepository.findByUsername(username);
		
		System.err.println(vendor);
		if(bc.matches(password,vendor.getPassword())){
			return vendor;
		}
		return new Vendor(new Long(-1));
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		Vendor existingUser = vendorRepository.findByUsername(vendor.getUsername());
		if (existingUser == null)
			throw new RuntimeException("User with username=" + vendor.getUsername() + " Not found");
		// @TODO: Do some more validations.

		vendor.setId(existingUser.getId());
		return vendorRepository.save(vendor);
	}
}
