package com.christien.springbootdemo.common.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArcherService {
	
	@Autowired
	private ArcherRepository archerRepository;
	
	public List<Archer> getAllArchers(){
		List<Archer> archers = new ArrayList<>();
		archerRepository.findAll()
		.forEach(archer->archers.add(archer));
		return archers;
	}
	
	public Archer getArcher(Integer id) {
		return archerRepository.findById(id).get();
	}
	
	public void addArcher(Archer archer) {
		archerRepository.save(archer);
	}
	
	public void updateArcher(Integer id, Archer archer) {
		archerRepository.save(archer);
	}
	
	public void deleteArcher(Integer id) {
		archerRepository.deleteById(id);
	}
	
}
