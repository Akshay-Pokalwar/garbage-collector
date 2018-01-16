package com.project.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, columnDefinition = "BIGINT UNSIGNED")
	private Long id;
	
	@Column(name="username", nullable=false, unique=true)
	private String username;
	
	@Column
	private String password;
	
	@Column(name="email")
	private String email;
	
	@Column(name="contact_no")
	private String contactNo;
	
	@Column
	private String city;
	
	@Column
	private String securityAns;
	
	
	public User(Long id) {
		super();
		this.id = id;
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
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", contactNo=" + contactNo + ", city=" + city + ", securityAns=" + securityAns + "]";
	}
	
	
}
