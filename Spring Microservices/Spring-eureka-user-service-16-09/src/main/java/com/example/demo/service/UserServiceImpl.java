package com.example.demo.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.UserDto;
import com.example.demo.Repo.UsersRepository;
import com.example.demo.entity.User;
import com.example.demo.model.CreateUserRequestModel;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UsersRepository usersRepository;
	

	@Override
	public UserDto adduser(UserDto uderdetails) {
		// TODO Auto-generated method stub
		ModelMapper mapper = new ModelMapper();
		User user = mapper.map(uderdetails, User.class);
		usersRepository.save(user);
		UserDto userdto = mapper.map(user, UserDto.class);
		return userdto;
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		usersRepository.deleteById(id);
		
	}


	@Override
	public UserDto update(User user) {
		ModelMapper mapper = new ModelMapper();
		User userdetail = mapper.map(user, User.class);
		usersRepository.save(userdetail);
		UserDto userdto= mapper.map(userdetail, UserDto.class);
		return userdto;
	}


	@Override
	public List<User> findall() {
		// TODO Auto-generated method stub
		List<User> users = (List<User>) usersRepository.findAll();
		return users;
	}


	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		
		return usersRepository.findById(id).get();
	}


	@Override
	public List<User> findBylname(String lname) {
		// TODO Auto-generated method stub
		return usersRepository.findBylname(lname);
	}


	@Override
	public void updateuser(User user) {
		// TODO Auto-generated method stub
		usersRepository.save(user);
		
	}

}
