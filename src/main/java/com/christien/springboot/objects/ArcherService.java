package com.christien.springboot.objects;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ArcherService {
	
	private List<Archer> archers = Arrays.asList(
			new Archer("Christien", new Bow("hoyt", 599.99))
			); 
	
	
	public List<Archer> getArchers(){
		return archers;
	}
}
