package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Repo.BookingRepo;
import com.example.demo.Repo.UserRepo;
import com.example.demo.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {

	private UserRepo userRepo;
    private BookingRepo bookingRepo;
    @Autowired
	public UserController(UserRepo userRepo, BookingRepo bookingRepo) {
		super();
		this.userRepo = userRepo;
		this.bookingRepo = bookingRepo;
	}
    
    @GetMapping("/view")
    public String showuser(Model model) {
    	
    	model.addAttribute("user", userRepo.findAll());
    	
    	return "userlist";
    }
    
    @PostMapping("/save")
    public String saveuser(@ModelAttribute("user") User user,Model model) {
    	userRepo.save(user);
    	model.addAttribute("user", user);
    	return "userHome";
    }
    
}