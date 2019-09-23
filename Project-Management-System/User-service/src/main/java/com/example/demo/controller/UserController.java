package com.example.demo.controller;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.User;
import com.example.demo.model.CreateUserRequestModel;
import com.example.demo.model.CreateUserResponseModel;
import com.example.demo.service.UserService;
import com.example.demo.shared.UserDto;

@Controller
@RestController
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserService service;
	@GetMapping("/getalluser")
    public ResponseEntity<List<User>> getAlluser(){
   	 
   	 return ResponseEntity.ok(service.findAll()); 
    }
    
	@PostMapping("/findbyid")
   public ResponseEntity<User> findById(@RequestParam("id") int id){
   	
   	return ResponseEntity.ok(service.findById(id));
   }
   
   @GetMapping("/findbyname/{username}")
   public ResponseEntity<List<User>> userbyName(@PathVariable("username") String username){
   	
   	return ResponseEntity.ok(service.findByusername(username));
   }
   @GetMapping("/findbylocation/{ulocation}")
   public ResponseEntity<List<User>> userbyLoction(@PathVariable("ulocation") String ulocation){
   	
   	return ResponseEntity.ok(service.findBylocation(ulocation));
   }
   @GetMapping("/findbyavailability/{avialability}")
   public ResponseEntity<List<User>> userbyAvailability(@PathVariable("avialability") String avialability){
   	
   	return ResponseEntity.ok(service.findByavailability(avialability));
   }
   @GetMapping("/findbyemail/{email}")
   public ResponseEntity<List<User>> userbyEmail(@PathVariable("email") String email){
   	
   	return ResponseEntity.ok(service.findByemail(email));
   }
   @GetMapping("/findbydomain/{udomain}")
   public ResponseEntity<List<User>> userbyDomain(@PathVariable("udomain") String udomain){
   	
   	return ResponseEntity.ok(service.findBydomain(udomain));
   }
   
   
   @PostMapping("/adduser")
	public ResponseEntity<CreateUserResponseModel> create(@RequestBody CreateUserRequestModel userDetail)
	{
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		UserDto uDto=mapper.map(userDetail, UserDto.class);
		
		UserDto tempDto=service.saveUser(uDto);
		CreateUserResponseModel model=mapper.map(tempDto, CreateUserResponseModel.class);;
		return ResponseEntity.status(HttpStatus.CREATED).body(model);

	}
   @PostMapping("/deleteuser")
   public ResponseEntity<?> deleteUser(@RequestParam("id")int id){
   	service.deleteUser(id);
   	return ResponseEntity.ok("deleted");
   }
  
   @PutMapping("/update/{id}")
   public ResponseEntity<CreateUserResponseModel> update(@RequestBody CreateUserRequestModel req,@PathVariable("id") int id){
		ModelMapper mapper = new ModelMapper();
		UserDto dto = mapper.map(req, UserDto.class);
		UserDto dto1 = service.update(dto,id);
		CreateUserResponseModel user = mapper.map(dto1, CreateUserResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	
	}

}