package com.project.core.rest;


import com.project.core.domain.Product;
import com.project.core.domain.User;
import com.project.core.domain.Vendor;
import com.project.core.dto.VendorDTO;
import com.project.core.dto.VendorPriceDTO;
import com.project.core.service.VendorService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/vendor")
public class VendorController {

    @Autowired
    private VendorService vendorService;
    
    @GetMapping(value="/usersearch/{id}")
    List<VendorPriceDTO> getBySearchOnId(@PathVariable Long id){
    	//System.out.println("some value here");
    	List<VendorPriceDTO> list=vendorService.getBySearchOnId(id);
    	if(list!=null)
    	{
    		return list;
    	}
        return null ;
    }

    @GetMapping(value="/{id}")
    VendorDTO getById(@PathVariable Long id){
        return vendorService.getById(id);
    }
    
    @PostMapping
	public VendorDTO saveVendor(@RequestBody VendorDTO obj) {
		return vendorService.saveVendor(obj);
	}
    
    @GetMapping(value="/namepassword/{username}/{password}")
	public String getByUsername(@PathVariable String username,@PathVariable String password)
	{
		VendorDTO vendor=vendorService.findByUsername(username, password);
		if(vendor!=null){
			return vendor.getUsername();
		}
		return null;
	}
    
    @PutMapping("/{id}")
	public Vendor updateuser(@PathVariable Long id, @RequestBody Vendor vendor) {
    	vendor.setId(id);
		Vendor updatedUser= vendorService.updateVendor(vendor);
		return updatedUser;
	}
    
}
