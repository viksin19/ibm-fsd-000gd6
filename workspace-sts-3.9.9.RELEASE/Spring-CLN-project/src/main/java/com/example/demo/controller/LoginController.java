package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.Repo.UserRepo;
import com.example.demo.entity.Repo.AdminRepo;

@Controller

public class LoginController {
   
	private AdminRepo adminRepo;
	private UserRepo userRepo;
	@Autowired
	public LoginController(AdminRepo adminRepo, UserRepo userRepo) {
		super();
		this.adminRepo = adminRepo;
		this.userRepo = userRepo;
	}
	
}
