package com.christien.springboot.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.christien.springboot.objects.Archer;
import com.christien.springboot.objects.ArcherService;
import com.christien.springboot.objects.Bow;

@RestController
@RequestMapping("/")
public class FailSafeUiController {
	
	@Autowired
	private ArcherService archerService;
	
	@RequestMapping("/login")
	public String login() {
		return "Welcome to Login Screen...";
	}
	
	//request mapping by default only handles GET requests, to handle others have to specifically mention it
	@RequestMapping("/hunters")
	public List<Archer> getHunters() {
		return archerService.getArchers(); 
	}
	
	
}
