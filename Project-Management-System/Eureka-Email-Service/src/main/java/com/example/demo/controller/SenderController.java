package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SendMailService;
@Controller
@RestController
public class SenderController {

	@Autowired
	private SendMailService service;
	
	@GetMapping("/sendmail")
	public ResponseEntity<String> sendmail(){
		 
		service.sendMail("jai12vikram@gmail.com", "Hello ", "<h1>Haad Kar Di yaar tune </h1>");
		
		return ResponseEntity.ok("Mail Send");
	}
}
