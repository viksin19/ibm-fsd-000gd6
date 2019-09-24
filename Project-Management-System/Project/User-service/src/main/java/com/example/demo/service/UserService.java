package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;
import com.example.demo.shared.UserDto;

public interface UserService {
	   
	public List<User> findAll();
	public List<User> findByusername(String username);
	public User findById(int id);
	public UserDto saveUser(UserDto user);
	public void deleteUser(int id);
	public List<User> findBylocation(String ulocation);
	public List<User> findByavailability(String avialability);
	public List<User> findByemail(String email);
	public List<User> findBydomain(String udomain);
	
}