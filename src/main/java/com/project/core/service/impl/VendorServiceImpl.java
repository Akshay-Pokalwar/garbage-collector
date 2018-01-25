package com.project.core.service.impl;

import com.project.core.domain.Product;
import com.project.core.domain.User;
import com.project.core.domain.Vendor;
import com.project.core.domain.VendorProduct;
import com.project.core.dto.ProductDTO;
import com.project.core.dto.VendorDTO;
import com.project.core.repository.ProductRepository;
import com.project.core.repository.VendorRepository;
import com.project.core.service.VendorService;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VendorServiceImpl implements VendorService {

    @Autowired
    VendorRepository vendorRepository;
    
    @Autowired
    ProductRepository productRepository;

    @Override
    public VendorDTO getById(Long id) {
        Vendor vendor = vendorRepository.getOne(id);
        VendorDTO vendorDTO=new VendorDTO();
        vendorDTO.setId(vendor.getId());
		vendorDTO.setUsername(vendor.getUsername());
		vendorDTO.setPassword(vendor.getPassword());
		vendorDTO.setEmail(vendor.getEmail());
		vendorDTO.setCity(vendor.getCity());
		vendorDTO.setContactNo(vendor.getContactNo());
		vendorDTO.setSecurityAns(vendor.getSecurityAns());
        return vendorDTO;
    }

	@Override
	@Transactional
	public VendorDTO saveVendor(VendorDTO vendordto) {
		BCryptPasswordEncoder bc = new BCryptPasswordEncoder();
		String encPassword = bc.encode(vendordto.getPassword());
		vendordto.setPassword(encPassword);
		
		
		String encSecurity = bc.encode(vendordto.getSecurityAns());
		vendordto.setSecurityAns(encSecurity);
		
		Vendor vendor=new Vendor();
		vendor.setUsername(vendordto.getUsername());
		vendor.setPassword(encPassword);
		vendor.setEmail(vendordto.getEmail());
		vendor.setCity(vendordto.getCity());
		vendor.setContactNo(vendordto.getContactNo());
		vendor.setSecurityAns(encSecurity);
		
		Vendor v = vendorRepository.save(vendor);
		
		//Set<ProductDTO> productdto=new HashSet<>();
		
//		Set<VendorProduct> vendorproductSet=new HashSet<>();
		//v.getId();
		Set<ProductDTO> prods=vendordto.getProducts();
		
		Iterator<ProductDTO> iter=prods.iterator();
		
		
		while (iter.hasNext()) {
			ProductDTO prodDto=iter.next();
			
			VendorProduct vendorprod=new VendorProduct();
			
			vendorprod.setVendor(v);
			
			
			Product product=productRepository.findOne(prodDto.getId());
			vendorprod.setProduct(product);
			vendorprod.setPrice(prodDto.getPrice());
			v.getVendorProduct().add(vendorprod);
		}
		
//		v.setVendorProduct(vendorproductSet);
		
//		Vendor newVendor=vendorRepository.save(v);
		
		//HashMap<Long, Set<ProductDTO>> vendorproduct=new HashMap<>();
		
		
		
		return vendordto;

	}

	@Override
	public VendorDTO findByUsername(String username, String password) {
		System.err.println("USERNAME : " + username + "   PASSWORD: " + password);
		BCryptPasswordEncoder bc=new BCryptPasswordEncoder();
		
		Vendor vendor = vendorRepository.findByUsername(username);
		
		System.err.println(vendor);
		if(bc.matches(password,vendor.getPassword())){
			VendorDTO vendorDTO=new VendorDTO();
			vendorDTO.setId(vendor.getId());
			vendorDTO.setUsername(vendor.getUsername());
//			vendorDTO.setPassword(vendor.getPassword());
//			vendorDTO.setEmail(vendor.getEmail());
//			vendorDTO.setCity(vendor.getCity());
//			vendorDTO.setContactNo(vendor.getContactNo());
//			vendorDTO.setSecurityAns(vendor.getSecurityAns());
			return vendorDTO;
		}
		return new VendorDTO(new Long(-1));
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		Vendor existingUser = vendorRepository.findByUsername(vendor.getUsername());
		if (existingUser == null)
			throw new RuntimeException("User with username=" + vendor.getUsername() + " Not found");
		// @TODO: Do some more validations.

		vendor.setId(existingUser.getId());
//		vendor.setId(existingUser.getId());
//		vendor.setUsername(existingUser.getUsername());
//		vendor.getPassword();
//		vendor.getEmail();
		
		return vendorRepository.save(vendor);
	}
}
