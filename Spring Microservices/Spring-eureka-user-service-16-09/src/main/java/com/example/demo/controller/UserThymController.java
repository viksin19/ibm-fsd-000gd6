package com.example.demo.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/thym")
public class UserThymController {
	@Autowired
	UserService userservice;
	
     @GetMapping("/view")
     public String userview(Model model) {
    	 List<User> users = userservice.findall();
    	 model.addAttribute("users", users);
    	 return "home";
     }
	
     @GetMapping("/addform")
     public String addForm(Model model) {
    	 User user = new User();
    	 model.addAttribute("user", user);
    	 return "showform";
     }
     @PostMapping("/save")
     public String saveuser(@ModelAttribute User user) {
 		ModelMapper mapper = new ModelMapper();
 		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
 		UserDto userDto = mapper.map(user, UserDto.class);
 		userDto=userservice.adduser(userDto);   	 
    	 return "redirect:/thym/view";
    	 
     }
     @PostMapping("/updateform")
     public String updateform(@RequestParam("id") int id, Model model) {
    	 model.addAttribute("user", userservice.findById(id));
    	 return "updateform";
     }
     @PostMapping("/update")
     public String updateuser(@ModelAttribute User user) {
    	 
    	 userservice.updateuser(user);
    	 return "redirect:/thym/view";
     }
     @PostMapping("/delete")
     public String deleteuser(@RequestParam("id") int id) {
    	 userservice.delete(id);
    	 return "redirect:/thym/view";
     }
      
     @PostMapping("/searchbylname")
     public String searchBylastName(@RequestParam("lname") String lname,Model model) {
    	 
    	 model.addAttribute("users", userservice.findBylname(lname));
    	 return "home"; 
     }
}
