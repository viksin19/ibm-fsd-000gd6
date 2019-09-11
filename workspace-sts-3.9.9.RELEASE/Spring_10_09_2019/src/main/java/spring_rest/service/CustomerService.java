package spring_rest.service;

import java.util.List;

import spring_rest.entity.Customer;

public interface CustomerService {

	public List<Customer> getAllCustomer();
	
	public void addCustomer(Customer customer);
	
	public void updateCustomer(Customer customer);
	
	public Customer findById(int id);
	
	public void deleteCustomer(int id);
}
