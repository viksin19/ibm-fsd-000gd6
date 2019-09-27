package com.example.user.service;

import java.util.List;

import com.example.user.data.User;
import com.example.user.shared.UserDto;

public interface UserService {
	
	public UserDto createNewUser(UserDto userDetail);
	public UserDto getUserByEmail(String email);
	public List<User> findAll();
	public List<User> findByusername(String username);
	public User findById(Long id);
	public void deleteUser(Long id);
	public List<User> findBylocation(String ulocation);
	public List<User> findByavailability(String availability);
	public User findEmailAndPassword(String email,String password); 
	public List<User> findBydomain(String udomain);
	public List<User> getByRole(String urole);
	public List<User> getAllUser();
}
