package com.christien.springbootdemo.common.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private List<User> users = new ArrayList<>(Arrays.asList(
			new User(1, "ChristienCoder", "password", "Christien", "Soosaipillai"),
			new User(2, "SecretCoder", "password", "Christien", "Soosaipillai"),
			new User(3, "LameCode", "password", "Christien", "Soosaipillai")
	));
	
	public List<User> getAllUsers(){
		return users;
	}
	
	public User getUser(Integer id) {
		return users.stream()
				.filter(user-> id.equals(user.getId()))
				.findFirst()
				.orElse(null);
	}
	
	public void addUser(User user) {
		users.add(user);
	}
	
	public void updateUser(Integer id, User user) {
		for(int i = 0; i < users.size(); i++) {
			User u = users.get(i);
			if(u.getId() == id) {
				users.set(i, user);
			}
		}
	}
	
	public void deleteUser(Integer id) {
		users.removeIf(user -> user.getId() == id);
	}
	
}
