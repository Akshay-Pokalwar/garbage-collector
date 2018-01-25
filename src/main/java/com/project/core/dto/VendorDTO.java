package com.project.core.dto;

import java.util.HashSet;
import java.util.Set;


public class VendorDTO {

	private Long id;
	 
	private String username;
		
	private String password;
	
	private String email;
	
	private String contactNo;
	
	private String city;
	
	private String securityAns;
	
	Set<ProductDTO> products= (Set<ProductDTO>) new HashSet();
	
	public VendorDTO() {
		// TODO Auto-generated constructor stub
	}


	public VendorDTO(Long id, String username, String password, String email, String contactNo, String city,
			String securityAns, Set<ProductDTO> products) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.contactNo = contactNo;
		this.city = city;
		this.securityAns = securityAns;
		this.products = products;
	}


	public VendorDTO(Long long1) {
		// TODO Auto-generated constructor stub
	}


	public Set<ProductDTO> getProducts() {
		return products;
	}


	public void setProducts(Set<ProductDTO> products) {
		this.products = products;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSecurityAns() {
		return securityAns;
	}

	public void setSecurityAns(String securityAns) {
		this.securityAns = securityAns;
	}

	@Override
	public String toString() {
		return "Vendor [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", contactNo=" + contactNo + ", city=" + city + ", securityAns=" + securityAns + "]";
	}
	
	
	
}
