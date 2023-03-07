package com.pooja.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pooja.model.User;

@Service
public interface UserService {
	void add(User user);  
     
	List<User> getAll(); 
	String login(User user);
//	User getByEmailAndPassword(String email, String password);
	 
	List<User> getByUnauthenticated();
}
