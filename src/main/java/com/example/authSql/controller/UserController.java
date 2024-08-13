package com.example.authSql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.authSql.service.userService;
import com.example.authSql.entity.User;

@RestController()
@RequestMapping(path = "api/v1/auth")
public class UserController {
	@Autowired
	userService userService;
	
	@PostMapping()
	public String auth(@RequestBody User user) {
		return userService.auth(user);
	}
}
