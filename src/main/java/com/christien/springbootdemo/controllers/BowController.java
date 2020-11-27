package com.christien.springbootdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.christien.springbootdemo.common.Bow.Bow;
import com.christien.springbootdemo.common.Bow.BowService;
import com.christien.springbootdemo.common.user.User;

@RestController
@RequestMapping("/bows")
public class BowController {

	@Autowired
	private BowService bowService;
	
	@RequestMapping
	public List<Bow> getUsers(){
		return bowService.getAllBows();
	}
	
	@RequestMapping("/{id}")
	public Bow getBow(@PathVariable Integer id){
		return bowService.getBow(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void addBow(@RequestBody Bow bow){
		bowService.addBow(bow);
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.PUT)
	public void updateUser(@PathVariable Integer id, @RequestBody Bow bow){
		bowService.updateBow(bow);
	}

	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void deleteBow(@PathVariable Integer id){
		bowService.deleteBow(id);
	}
	
	
}
