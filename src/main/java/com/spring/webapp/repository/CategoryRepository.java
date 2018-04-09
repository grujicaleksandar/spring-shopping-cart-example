package com.spring.webapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.webapp.models.Category;
@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>{

}
