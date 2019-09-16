package com.example.demo.controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.UserDto;
import com.example.demo.model.CreateUserRequestModel;
import com.example.demo.model.CreateUserResponseModel;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserService userservice;
	@PostMapping("/users")
	public ResponseEntity<CreateUserResponseModel> adduser(@RequestBody CreateUserRequestModel userRequestmodel){
		
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserDto userDto = mapper.map(userRequestmodel, UserDto.class);
		userDto=userservice.adduser(userDto);
		CreateUserResponseModel responsemodel = mapper.map(userDto, CreateUserResponseModel.class);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(responsemodel);
		
		
		
	}

}
