package com.project.core.domain;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.project.core.dto.ProductDTO;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="vendor")
public class Vendor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="vid" , nullable = false, columnDefinition = "BIGINT UNSIGNED")
	private Long id;
	
	@Column(name="username", nullable=false, unique=true)
	private String username;
	
	@Column
	private String password;
	
	@Column
	private String email;
	
	@Column(name="contact_no")	
	private String contactNo;
	
	@Column
	private String city;
	
	@Column
	private String securityAns;

	@OneToMany(mappedBy = "vendor",cascade = CascadeType.ALL)
	private Set<VendorProduct> vendorProduct=new HashSet<>();
	
	
	public Vendor() {
		// TODO Auto-generated constructor stub
	}
	
	public Vendor(Long id, String username, String password, String email, String contactNo, String city,
			String securityAns,Set <ProductDTO> products) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.contactNo = contactNo;
		this.city = city;
		this.securityAns = securityAns;
		//this.vendorProduct = new HashSet<>();
	}

	public Vendor(Long long1) {
		// TODO Auto-generated constructor stub
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

	public Set<VendorProduct> getVendorProduct() {
		return vendorProduct;
	}

	public void setVendorProduct(Set<VendorProduct> vendorProduct) {
		this.vendorProduct = vendorProduct;
	}
}
