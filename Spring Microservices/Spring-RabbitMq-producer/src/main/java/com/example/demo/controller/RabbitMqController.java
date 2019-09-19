package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.RabbitMqService;

@Controller
@RestController
public class RabbitMqController {
	  @Autowired
	    RabbitMqService rabbitMqService;

	    @PostMapping("/products")
	    public ResponseEntity<String> postMessage(@RequestBody Product product){
	        rabbitMqService.sendMessage(product);
	        return new ResponseEntity<String>("Item pushed to RabbitMQ",HttpStatus.CREATED);
	    }
}
