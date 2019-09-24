package com.example.demo.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.enitity.User;
import com.example.demo.service.SendMailService;
@Controller

public class SenderController {

	@Autowired
	private SendMailService service;
	
	@RequestMapping("/")
	public String homepage() {
		return "index";
	}
	@GetMapping("/loginform")
	public String loginform(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		
		return "login";
	}
	
	@GetMapping("/signupform")
	public String signupForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "home";
	}
	@PostMapping("/sendmail")
	public ResponseEntity<String> sendmail(@ModelAttribute User user) throws MessagingException{
		 
		
		service.sendMail(user.getEmail(), "Hello ",getbody(user));
		
		return ResponseEntity.ok("Mail Send to :"+user.getName());
	}
	
	
	
	public String getbody(User user) {
		
		return "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Insert title here</title>\r\n" + 
				"<!-- Latest compiled and minified CSS -->\r\n" + 
				"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n" + 
				"\r\n" + 
				"<!-- jQuery library -->\r\n" + 
				"<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n" + 
				"\r\n" + 
				"<!-- Popper JS -->\r\n" + 
				"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n" + 
				"\r\n" + 
				"<!-- Latest compiled JavaScript -->\r\n" + 
				"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n" + 
				"<style>\r\n" + 
				"body{\r\n" + 
				"background-image: url(\"https://wallpapercave.com/wp/wp2351082.jpg\");\r\n" + 
				"background-repeat: no-repeat;\r\n" + 
				"background-attachment: fixed;\r\n" + 
				"width: 100%;\r\n" + 
				"	height: 800px;\r\n" + 
				"}\r\n" + 
				"</style>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"<br>\r\n" + 
				"<div class=\"container\">\r\n" + 
				"<h2 styles="+"color: green;"+">Successefully Registered !!!</h2><br>"+
				"<h6>"+user.getName()+"</h6><br>"+
				"<h6>"+user.getLocation()+"</h6><br>"+ 
				"<h6>"+user.getAge()+"</h6><br>"+ 
				"<h6>"+user.getStatus()+"</h6><br>"+ 
				"</div>\r\n" + 
				"</body>\r\n" + 
				"</html>";
	}
}
