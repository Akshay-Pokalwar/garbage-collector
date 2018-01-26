package com.project.core.service.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.core.domain.Product;
import com.project.core.domain.VendorProduct;
import com.project.core.dto.ProductDTO;
import com.project.core.repository.ProductRepository;
import com.project.core.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	
	@Override
	public Product getById(Long id) {
		Product prod = productRepository.findOne(id);
		Product product=new Product();
		product.setId(prod.getId());
		product.setName(prod.getName());
		product.setDescription(prod.getDescription());
		product.setQuantity(prod.getQuantity());
		//productDTO.setPrice();
		System.err.println(product);
		//vendorProduct.getPrice();
		//productDTO.setId(product.getId());
		//productDTO.setPrice();
		if (product != null) {
			return product;
		}
		throw new RuntimeException("NO PRODUCT FOUND WITH ID : " + id);
	}

	@Override
	public Product getByName(String name) {
		Product prod = productRepository.getByName(name);
		Product product=new Product();
		product.setId(prod.getId());
		product.setName(prod.getName());
		product.setDescription(prod.getDescription());
		product.setQuantity(prod.getQuantity());
		if (product != null) {
			return product;
		}
		throw new RuntimeException("NO PRODUCT FOUND WITH name : " + name);
	}

	/*@Override
	public Product findByNameAndPrice(String name, Double price) {
		Product product = productRepository.findByNameAndPrice(name, price);
		if (product != null) {
			return product;
		}
		throw new RuntimeException("NO PRODUCT FOUND WITH NAME : " + name + "  PRICE: " + price);
	}*/
	

	@Override
	public List<Product> findByGtId(Long id) {
		List<Product> products=productRepository.findByGtProductId(id);
//		Iterator iter=prod.iterator();
//		List<Product> product;
//		while(iter.hasNext())
//		{
//			iter.next();
//		}
		return products;
	}

}
