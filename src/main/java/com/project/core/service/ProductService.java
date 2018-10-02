package com.project.core.service;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import com.project.core.domain.Product;
public interface ProductService {
	public Product getById(Long id);
	public Product getByName(String name);
	public List<Product> findByGtId(Long id);
}
