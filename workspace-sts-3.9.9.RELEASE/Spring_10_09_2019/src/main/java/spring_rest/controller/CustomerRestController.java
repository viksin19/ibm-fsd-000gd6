package spring_rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring_rest.entity.Customer;
import spring_rest.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
@Autowired
	private CustomerService service;

@GetMapping("/customers")
public List<Customer> getallcustomer(){
	return service.getAllCustomer();
}

@PostMapping("/customers")
public String addCustomer(@RequestBody Customer customer) {
	customer.setId(0);
	service.addCustomer(customer);
	return "added";
	
}
@PutMapping("/customers")
public String update(@RequestBody Customer customer) {
	service.updateCustomer(customer);
	return "Updated";
	
}
@DeleteMapping("/customers/{id}")
public String delete(@PathVariable int id) {
	service.deleteCustomer(id);
	return "delete";
	
}
@GetMapping("/customers/{id}")
public Customer find(@PathVariable int id) {
	Customer cust= service.findById(id);
	return cust;
	
}

}