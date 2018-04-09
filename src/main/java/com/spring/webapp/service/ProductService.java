package com.spring.webapp.service;

import java.util.List;

import com.spring.webapp.models.Product;

public interface ProductService {
	
	
	List<Product> getAll();
	Product findById(int id);
	Product findByName(String name);

}
