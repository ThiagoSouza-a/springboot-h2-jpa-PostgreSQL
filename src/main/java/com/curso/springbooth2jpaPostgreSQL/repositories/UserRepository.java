package com.curso.springbooth2jpaPostgreSQL.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.springbooth2jpaPostgreSQL.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
