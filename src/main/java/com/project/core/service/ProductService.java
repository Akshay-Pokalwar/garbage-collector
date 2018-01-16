package com.project.core.service;

import java.util.List;

import com.project.core.domain.Product;

public interface ProductService {
	public Product getById(Long id);
	public Product getByName(String name);
//	public Product findByNameAndPrice(String name,Double price);
	public List<Product> findByGtId(Long id);
}
