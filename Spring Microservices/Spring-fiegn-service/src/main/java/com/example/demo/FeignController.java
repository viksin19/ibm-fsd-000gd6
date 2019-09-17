package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FeignController {
	 @Autowired
	 ProductServiceClient productServiceClient;

	 @GetMapping("/fetchproducts")
	 public ResponseEntity <? > fetchProducts() {

	  return ResponseEntity.ok(productServiceClient.getallproduct());
	 }

	 @GetMapping("/fetchproduct/{id}")
	 public ResponseEntity < ? > fetchProduct(@PathVariable int id) {

	  return ResponseEntity.ok(productServiceClient.getproduct(id));
	 }
}
