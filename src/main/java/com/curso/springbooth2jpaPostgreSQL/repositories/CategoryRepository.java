package com.curso.springbooth2jpaPostgreSQL.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.springbooth2jpaPostgreSQL.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
