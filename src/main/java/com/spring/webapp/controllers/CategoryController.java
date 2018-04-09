package com.spring.webapp.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.webapp.models.Category;
import com.spring.webapp.service.CategoryService;

@Controller
public class CategoryController {

	private CategoryService categoryService;

	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@RequestMapping("/categories")
	public String findCategories(Model model){
		
		List<Category> categories = categoryService.getAll();
		
		model.addAttribute("categories",categories);
		
		return "category-list";
		
	}
	@RequestMapping("/category/{id}")
	public String getCategoryInfo(@PathVariable int id,Model model){
		
		Category category = categoryService.findById(id);
		
		model.addAttribute("category",category);
		
		return "category-info";
		
		
		
	}
	
}
