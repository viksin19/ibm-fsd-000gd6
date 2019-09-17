package com.example.demo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "product-service")
public interface ProductServiceClient {

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public List<Product> getallproduct();
	
	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
	public Product getproduct(@PathVariable int id);
		
		
	
}
