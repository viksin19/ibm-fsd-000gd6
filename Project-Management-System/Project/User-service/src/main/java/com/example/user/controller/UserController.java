package com.example.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.data.ErrorClass;
import com.example.user.data.Login;
import com.example.user.data.User;
import com.example.user.model.CreateUserRequestModel;
import com.example.user.model.CreateUserResponseModel;
import com.example.user.service.UserService;
import com.example.user.shared.UserDto;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public ResponseEntity<?> createTask(@RequestBody ArrayList<CreateUserRequestModel> user) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		CreateUserRequestModel userDetail = user.get(0);
		UserDto uDto = mapper.map(userDetail, UserDto.class);

		UserDto userDto = userService.createNewUser(uDto);
		CreateUserResponseModel model = mapper.map(userDto, CreateUserResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(model);

	}
	
	@GetMapping("/user/{email}")
	public ResponseEntity<?> createTask(@PathVariable("email") String email) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		UserDto userDto = userService.getUserByEmail(email);
		CreateUserResponseModel model = mapper.map(userDto, CreateUserResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(model);

	}
	
	@PostMapping("/user/login")
	public ResponseEntity<?> userbyEmail(@RequestBody ArrayList<Login> loginData) {
		Login userDetails = loginData.get(0);
		User user = userService.findEmailAndPassword(userDetails.getEmail(),userDetails.getPassword());
		if (user == null)
			return ResponseEntity.status(HttpStatus.CREATED).body(new ErrorClass("Email or password is wrong"));
		else
			return ResponseEntity.status(HttpStatus.CREATED).body(user);
	}
	
	@GetMapping("/user/getalluser")
	public ResponseEntity<List<User>> getAlluser() {

		return ResponseEntity.ok(userService.findAll());
	}

	@PostMapping("/user/findbyid")
	public ResponseEntity<User> findById(@RequestParam("id") Long id) {

		return ResponseEntity.ok(userService.findById(id));
	}

	@GetMapping("/user/findbyname/{username}")
	public ResponseEntity<List<User>> userbyName(@PathVariable("username") String username) {

		return ResponseEntity.ok(userService.findByusername(username));
	}

	@GetMapping("/user/findbylocation/{ulocation}")
	public ResponseEntity<List<User>> userbyLoction(@PathVariable("ulocation") String ulocation) {

		return ResponseEntity.ok(userService.findBylocation(ulocation));
	}

	@GetMapping("/user/findbyavailability/{avialability}")
	public ResponseEntity<List<User>> userbyAvailability(@PathVariable("avialability") String avialability) {

		return ResponseEntity.ok(userService.findByavailability(avialability));
	}
	@GetMapping("/user/role/{urole}")
	public ResponseEntity<List<User>> userbyRole(@PathVariable("urole") String urole) {

		return ResponseEntity.ok(userService.getByRole(urole));
	}
	
	@GetMapping("/user/findbydomain/{udomain}")
	public ResponseEntity<List<User>> userbyDomain(@PathVariable("udomain") String udomain) {

		return ResponseEntity.ok(userService.findBydomain(udomain));
	}
}
