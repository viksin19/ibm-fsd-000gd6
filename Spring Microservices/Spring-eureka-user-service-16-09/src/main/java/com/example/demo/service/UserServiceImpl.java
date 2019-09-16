package com.example.demo.service;

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

}
