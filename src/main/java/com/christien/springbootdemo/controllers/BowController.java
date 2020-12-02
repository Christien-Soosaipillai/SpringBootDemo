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
import com.christien.springbootdemo.common.user.Archer;

@RestController
public class BowController {

	@Autowired
	private BowService bowService;
	
	@RequestMapping("/archers/{archerId}/bows")
	public List<Bow> getUsers(@PathVariable Integer archerId){
		return bowService.getAllBows(archerId);
	}
	
	@RequestMapping("/archers/{archerId}/bows/{id}")
	public Bow getBow(@PathVariable Integer id){
		return bowService.getBow(id);
	}
	
	@RequestMapping(value="/archers/{archerId}/bows", method = RequestMethod.POST)
	public void addBow(@RequestBody Bow bow, @PathVariable Integer archerId){
		bow.setArcher(new Archer(archerId, "", "", "", ""));
		bowService.addBow(bow);
	}
	
	@RequestMapping(value="/archers/{archerId}/bows/{id}", method = RequestMethod.PUT)
	public void updateUser(@PathVariable Integer archerId, @PathVariable Integer id, @RequestBody Bow bow){
		bow.setArcher(new Archer(archerId, "", "", "", ""));
		bowService.updateBow(bow);
	}

	@RequestMapping(value="/archers/{archerId}/bows/{id}", method = RequestMethod.DELETE)
	public void deleteBow(@PathVariable Integer id){
		bowService.deleteBow(id);
	}
	
	
}
