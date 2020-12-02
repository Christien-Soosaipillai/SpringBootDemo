package com.christien.springbootdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.christien.springbootdemo.common.user.*;

@RestController
@RequestMapping("/archers")
public class UserController {
	
	
	@Autowired
	private ArcherService userService;
	
	@RequestMapping
	public List<Archer> getArchers(){
		return userService.getAllArchers();
	}
	
	@RequestMapping("/{id}")
	public Archer getArcher(@PathVariable Integer id){
		return userService.getArcher(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void addArcher(@RequestBody Archer archer){
		userService.addArcher(archer);
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.PUT)
	public void updateArcher(@PathVariable Integer id, @RequestBody Archer archer){
		 userService.updateArcher(id, archer);
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void deleteARcher(@PathVariable Integer id){
		userService.deleteArcher(id);
	}
	
	
}
