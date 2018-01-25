package com.project.core.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.core.domain.Product;
import com.project.core.service.ProductService;

@RestController
@RequestMapping(value="/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping(value="/{id}")
	public Product getById(@PathVariable Long id) {
		Product product=productService.getById(id);
		return product;
	}
	
	@GetMapping(value="/name/{name}")
	public Product getByName(@PathVariable String name) {
		Product product=productService.getByName(name);
		return product;
	}
	
	
//	@GetMapping(value="/ids/{id}")
//	public List<Product> getByName(@PathVariable Long id) {
//		List<Product> products=productService.findByGtId(id);
//		return products;
//	}
	
	/*@GetMapping(value="/nameprice/{name}/{price}")
	public Product getByNameAndPrice(@PathVariable String name,@PathVariable Double price) {
		Product product=productService.findByNameAndPrice(name, price);
		return product;
	}*/
	
	
}
