package com.christien.springbootdemo.common.Bow;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BowService {
	
	@Autowired
	private BowRepository bowRepository;
	
	public List<Bow> getAllBows(Integer id){
		List<Bow> bows = new ArrayList<>();
		bowRepository.findByArcherId(id)
			.forEach(e->bows.add(e));
		return bows;
	}
	
	public Bow getBow(Integer id) {
		return bowRepository.findById(id).get();
	}
	
	public void addBow(Bow bow){
		bowRepository.save(bow);
	}
	
	public void updateBow(Bow bow){
		bowRepository.save(bow);
	}
	
	public void deleteBow(Integer id) {
		bowRepository.deleteById(id);
	}
	
}
