package com.example.demo.controller;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.UserDto;
import com.example.demo.Repo.UsersRepository;
import com.example.demo.entity.User;
import com.example.demo.model.CreateUserRequestModel;
import com.example.demo.model.CreateUserResponseModel;
import com.example.demo.service.UserService;
import com.thoughtworks.xstream.mapper.Mapper;

@RestController
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserService userservice;
	@Autowired
	private UsersRepository userRepo;
	@PostMapping("/users")
	public ResponseEntity<CreateUserResponseModel> adduser(@RequestBody CreateUserRequestModel userRequestmodel){
		
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserDto userDto = mapper.map(userRequestmodel, UserDto.class);
		userDto=userservice.adduser(userDto);
		CreateUserResponseModel responsemodel = mapper.map(userDto, CreateUserResponseModel.class);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(responsemodel);
		}
	
	
	@GetMapping("/findbyid/{id}")
	public ResponseEntity<CreateUserResponseModel> finduser(@PathVariable int id){
		User user_result = userRepo.findById(id).get();
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		CreateUserResponseModel responsemodel = mapper.map(user_result, CreateUserResponseModel.class);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(responsemodel);
	}
	
	@GetMapping("/deleteuser/{id}")
	public String delete(@PathVariable int id ) {
		
		userservice.delete(id);
		
		return "deleted !!!";
	}
	@PostMapping("/updateuser")
	public ResponseEntity<CreateUserResponseModel> update(@RequestBody User user  ){
		
		UserDto userdto = userservice.update(user);
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		CreateUserResponseModel response = mapper.map(userdto, CreateUserResponseModel.class);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
		
		
	}


