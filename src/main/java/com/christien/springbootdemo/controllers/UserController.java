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
@RequestMapping("/users")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@RequestMapping
	public List<User> getUsers(){
		return userService.getAllUsers();
	}
	
	@RequestMapping("/{id}")
	public User getUser(@PathVariable Integer id){
		return userService.getUser(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void addUser(@RequestBody User user){
		userService.addUser(user);
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.PUT)
	public void updateUser(@PathVariable Integer id, @RequestBody User user){
		 userService.updateUser(id, user);
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable Integer id){
		userService.deleteUser(id);
	}
	
	
}
