package com.project.core.repository;

import com.project.core.domain.Vendor;
import com.project.core.dto.VendorDTO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Long> {

	//@Query("select v.username,v.password from Vendor v")
	Vendor findByUsername(String username);
}
