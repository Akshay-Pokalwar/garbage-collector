package com.project.core.dto;

public class VendorPriceDTO {

	private String name;
	
	private Double price;
	
	public VendorPriceDTO() {
		// TODO Auto-generated constructor stub
	}

	public VendorPriceDTO(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "VendorPriceDTO [name=" + name + ", price=" + price + "]";
	}
	
	
	
}
