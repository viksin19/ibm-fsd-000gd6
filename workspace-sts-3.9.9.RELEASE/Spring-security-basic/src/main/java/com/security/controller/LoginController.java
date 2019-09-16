package com.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	@GetMapping("/showloginpage")
	public String showMyLoginPage() {
		
		// return "plain-login";

		return "fancy-login";
}
	
	 
}
