package com.christien.springbootdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String Welcome() {
		return "Welcome to Spring Boot";
	}
	
	
}
