package com.project.core.dao;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="vendor")
public class Vendor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="vid" , nullable = false, columnDefinition = "BIGINT UNSIGNED")	
	private int id;
	 
	@Column(name="username")
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
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="vendor_product", 
				joinColumns={@JoinColumn(name="vid")}, 
				inverseJoinColumns={@JoinColumn(name="pid")})
	private Set<Product> products=new HashSet<Product>();
	//private Set<Vendor_Product> vendorProduct;
	
	
	public Vendor(int id, String username, String password, String email, String contactNo, String city,
			String securityAns, Set<Vendor_Product> vendorProduct) {
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

	
	//here is the ManyToMany mapping of vendor and product in table vendor_prod 

//	@ManyToMany
//	@JoinTable(name="vendor_prod" , joinColumns={@JoinColumn(name="vid")},
//	inverseJoinColumns={@JoinColumn(name="pid")})
//	private List<Product> product=new ArrayList<Product>();

	
	//private int price;
	
//	@OneToMany(mappedBy="vendor", cascade = CascadeType.ALL, orphanRemoval = true)
//	public Set<Vendor_Product> getVendorProduct() {
//		return vendorProduct;
//	}
//
//	public void setVendorProduct(Set<Vendor_Product> vendorProduct) {
//		this.vendorProduct = vendorProduct;
//	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
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


	
	
}
