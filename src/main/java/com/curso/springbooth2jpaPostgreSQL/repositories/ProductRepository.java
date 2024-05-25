package com.curso.springbooth2jpaPostgreSQL.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.springbooth2jpaPostgreSQL.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
