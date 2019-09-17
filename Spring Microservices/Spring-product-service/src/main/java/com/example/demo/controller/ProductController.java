package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;

@RestController
@RequestMapping("/")
public class ProductController {

	private static List<Product> list = new ArrayList<Product>();
	static {
		list.add(new Product(1,"Shampoo"));
		list.add(new Product(2,"Trimmer"));
		list.add(new Product(3,"Helmet"));
		list.add(new Product(4,"Bottels"));		
	}
	
	@GetMapping("/products")
	public ResponseEntity<?> getproducts(){
		return ResponseEntity.ok(list);
	}
	@GetMapping("/product/{id}")
     public ResponseEntity<?> findbyid(@PathVariable int id){
		
		Product product = findproducts(id);
		
		return ResponseEntity.ok(product);
	}
	private Product findproducts(int id) {
		// TODO Auto-generated method stub
		return list.stream()
				.filter(pro->pro.getId()==id).findFirst().orElse(null);
	}
}
