package com.example.demo.service;

import java.util.List;

import com.example.demo.Dto.UserDto;
import com.example.demo.entity.User;

public interface UserService {

	UserDto adduser(UserDto uderdetails);

	void delete(int id);

	UserDto update(User user);

	List<User> findall();

	User findById(int id);

	List<User> findBylname(String lname);

	void updateuser(User user);

}
