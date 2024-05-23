package com.curso.springbooth2jpaPostgreSQL.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.springbooth2jpaPostgreSQL.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
