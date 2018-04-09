package com.spring.webapp.service;

import java.util.List;

import com.spring.webapp.models.Category;

public interface CategoryService {

	List<Category> getAll();
	Category findById(int id);
	
}
