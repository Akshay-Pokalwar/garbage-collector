package com.project.core.dto;

import javax.persistence.Column;

public class Vendor {

	private Long id;
	 
	private String username;
		
	private String password;
	
	private String email;
	
	private String contactNo;
	
	private String city;
	
	private String securityAns;
	
	public Vendor() {
		// TODO Auto-generated constructor stub
	}

	public Vendor(Long id, String username, String password, String email, String contactNo, String city,
			String securityAns) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.contactNo = contactNo;
		this.city = city;
		this.securityAns = securityAns;
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
