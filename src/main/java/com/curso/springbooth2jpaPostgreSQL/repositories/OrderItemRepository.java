package com.curso.springbooth2jpaPostgreSQL.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.springbooth2jpaPostgreSQL.entities.OrderItem;
import com.curso.springbooth2jpaPostgreSQL.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
	

}
