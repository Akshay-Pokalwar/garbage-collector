package com.project.core.dao;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="vendor_product")
public class Vendor_Product implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vpid", nullable = false, columnDefinition = "BIGINT UNSIGNED")
	private Long id;
	
private Vendor vendor;
	
	
	private Product product;
	
//	@Id
//	@ManyToOne
//	@JoinColumn(name = "vid")
//	public Long getVid() {
//		return vid;
//	}
//
//	public void setVid(Long vid) {
//		this.vid = vid;
//	}
//	
//	@Id
//	@ManyToOne
//	@JoinColumn(name = "pid")
//	public Long getPid() {
//		return pid;
//	}
//
//	public void setPid(Long pid) {
//		this.pid = pid;
//	}

	
	
	@Column(name="price")
	private int price;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "vid")
	public Vendor getVendor() {
		return vendor;
	}

	
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	 
	@Id
	@ManyToOne
	@JoinColumn(name = "pid")
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
}
