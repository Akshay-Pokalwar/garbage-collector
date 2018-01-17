package com.project.core.rest;


import com.project.core.domain.User;
import com.project.core.domain.Vendor;
import com.project.core.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/vendor")
public class VendorController {

    @Autowired
    VendorService vendorService;

    @GetMapping(value="/{id}")
    Vendor getById(@PathVariable Long id){
        return vendorService.getById(id);
    }
    
    @PostMapping
	public Vendor saveuser(@RequestBody Vendor obj) {
		return vendorService.saveVendor(obj);
	}
    
    @GetMapping(value="/namepassword/{username}/{password}")
	public Vendor getByUsername(@PathVariable String username,@PathVariable String password)
	{
		Vendor vendor=vendorService.findByUsername(username, password);
		if(vendor!=null){
			return vendor;
		}
		return new Vendor(new Long(-1));
	}
    
    @PutMapping("/{id}")
	public Vendor updateuser(@PathVariable Long id, @RequestBody Vendor vendor) {
    	vendor.setId(id);
		Vendor updatedUser= vendorService.updateVendor(vendor);
		return updatedUser;
	}
    
}
