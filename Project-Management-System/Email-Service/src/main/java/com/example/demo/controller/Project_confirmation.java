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
		return "<!DOCTYPE html>\r\n" + 
				"<html xmlns:th=\"http://www.thymeleaf.org\">\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Sign-Form</title>\r\n" + 
				"<!-- Latest compiled and minified CSS -->\r\n" + 
				"<link rel=\"stylesheet\"\r\n" + 
				"	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n" + 
				"\r\n" + 
				"<!-- jQuery library -->\r\n" + 
				"<script\r\n" + 
				"	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n" + 
				"\r\n" + 
				"<!-- Popper JS -->\r\n" + 
				"<script\r\n" + 
				"	src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n" + 
				"\r\n" + 
				"<!-- Latest compiled JavaScript -->\r\n" + 
				"<script\r\n" + 
				"	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n" + 
				"	<style>\r\n" + 
				"	.image{\r\n" + 
				"	background-image: url(\"https://contenthub-static.grammarly.com/blog/wp-content/uploads/2019/04/thumbnail-7075f02d50b2e1b87acaac02e0592003-760x400.jpeg\");\r\n" + 
				"	background-attachment: fixed;\r\n" + 
				"	background-repeat: no-repeat;\r\n" + 
				"	}\r\n" + 
				"	</style>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"	<div class=\"container\">\r\n" + 
				"		<div class=\"row\">\r\n" + 
				"			<h2>You are assigned in the Project</h2>\r\n" + 
				"		</div>\r\n" + 
				"		<br>\r\n" + 
				"		<br>\r\n" + 
				"		<hr>\r\n" + 
				"		<div class=\"row\">\r\n" + 
				"			<div class=\"image\"></div>\r\n" + 
				"		</div>\r\n" + 
				"		<br> <br>\r\n" + 
				"		<hr>\r\n" + 
				"		<div class=\"table table-light\">\r\n" + 
				"			<div class=\"thead thead-dark\">\r\n" + 
				"				<tr>\r\n" + 
				"					<th>Project_Name</th>\r\n" + 
				"					<th>Project_Manager</th>\r\n" + 
				"					<th>Project_Location</th>\r\n" + 
				"					<th>Start_Date</th>\r\n" + 
				"					<th>End_Date</th>\r\n" + 
				"				</tr>\r\n" + 
				"			</div>	\r\n" + 
				"			<div class=\"tbody\">\r\n" + 
				"			<tr>\r\n" + 
				"			<td>#name</td>\r\n" + 
				"			<td>#manager</td>\r\n" + 
				"			<td>#loction</td>\r\n" + 
				"			<td>#startDate</td>\r\n" + 
				"			<td>#endDate</td>\r\n" + 
				"			\r\n" + 
				"			</tr>\r\n" + 
				"			</div>\r\n" + 
				"			\r\n" + 
				"		</div>\r\n" + 
				"	</div>\r\n" + 
				"</body>\r\n" + 
				"</html> ";
	}

}
