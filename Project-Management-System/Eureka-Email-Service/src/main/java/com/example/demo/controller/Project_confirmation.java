package com.example.demo.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.enitity.User;
import com.example.demo.service.SendMailService;

@Controller
public class Project_confirmation {
	@Autowired
	private SendMailService service;
	
	@RequestMapping("/confirmproject")
	public ResponseEntity<String> confirmproject(@ModelAttribute User user) throws MessagingException {
		
		service.sendMail(user.getEmail(), "Hello ",getbody(user));
		return ResponseEntity.ok("succesfull");
	}

	private String getbody(User user) {
		// TODO Auto-generated method stub
		return "<!DOCTYPE html>\n" + 
				"<html xmlns:th=\"http://www.thymeleaf.org\">\n" + 
				"<head>\n" + 
				"<meta charset=\"ISO-8859-1\">\n" + 
				"<title>Sign-Form</title>\n" + 
				"<!-- Latest compiled and minified CSS -->\n" + 
				"<link rel=\"stylesheet\"\n" + 
				"	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n" + 
				"\n" + 
				"<!-- jQuery library -->\n" + 
				"<script\n" + 
				"	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" + 
				"\n" + 
				"<!-- Popper JS -->\n" + 
				"<script\n" + 
				"	src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n" + 
				"\n" + 
				"<!-- Latest compiled JavaScript -->\n" + 
				"<script\n" + 
				"	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n" + 
				"	<style>\n" + 
				"	h2{\n" + 
				"	color: green;\n" + 
				"	}\n" + 
				"	</style>\n" + 
				"</head>\n" + 
				"<body>\n" + 
				"\n" + 
				"	<div class=\"container\">\n" + 
				"		<div class=\"row\">\n" + 
				"			<h2>You are assigned in the Project</h2>\n" + 
				"		</div>\n" + 
				"		<br>\n" + 
				"		<br>\n" + 
				"		<hr>\n" + 
				"		<div class=\"row\">\n" + 
				"	<img src=\"https://contenthub-static.grammarly.com/blog/wp-content/uploads/2019/04/thumbnail-7075f02d50b2e1b87acaac02e0592003-760x400.jpeg\">\n" + 
				"		</div>\n" + 
				"		<br> <br>\n" + 
				"		<hr>\n" + 
				"		<table class=\"table table-light\">\n" + 
				"			<thead class=\" table  table-dark\">\n" + 
				"				<tr>\n" + 
				"					<th>Project_Name</th>\n" + 
				"					<th>Project_Manager</th>\n" + 
				"					<th>Project_Location</th>\n" + 
				"					<th>Start_Date</th>\n" + 
				"					<th>End_Date</th>\n" + 
				"				</tr>\n" + 
				"			</thead>	\n" + 
				"			<tbody class=\"table-light\">\n" + 
				"			<tr>\n" + 
				"			<td>#name</td>\n" + 
				"			<td>#manager</td>\n" + 
				"			<td>#loction</td>\n" + 
				"			<td>#startDate</td>\n" + 
				"			<td>#endDate</td>\n" + 
				"			\n" + 
				"			</tr>\n" + 
				"		</tbody>\n" + 
				"			\n" + 
				"	</table>\n" + 
				"	</div>\n" + 
				"</body>\n" + 
				"</html> ";
	}

}
