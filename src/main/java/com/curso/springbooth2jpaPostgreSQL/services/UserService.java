package com.curso.springbooth2jpaPostgreSQL.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.springbooth2jpaPostgreSQL.entities.User;
import com.curso.springbooth2jpaPostgreSQL.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {		
		return repository.findAll();
	}

}
