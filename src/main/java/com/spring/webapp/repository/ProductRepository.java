package com.spring.webapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.spring.webapp.models.Product;

@Component
public interface ProductRepository extends CrudRepository<Product, Integer>{

	Product getByName(String name);
	
}
