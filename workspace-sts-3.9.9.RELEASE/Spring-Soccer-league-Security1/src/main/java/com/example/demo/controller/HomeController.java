package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/showMyLogin")
	public String showMyPage() {
		System.out.println("fancy login working");
		return "fancylogin";
}
}
