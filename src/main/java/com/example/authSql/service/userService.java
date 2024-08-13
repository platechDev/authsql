package com.example.authSql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.authSql.entity.User;
import com.example.authSql.repository.userRepository;

@Service()
public class userService {
	@Autowired 
	userRepository userRepository;
	
	public String auth(User user) {
		return "autenticado";
	}
}
