package spring_rest.DAO;

import java.util.List;

import spring_rest.entity.Customer;

public interface CustomerDAO {
public List<Customer> getAllCustomer();
	
	public void addCustomer(Customer customer);
	
	public void updateCustomer(Customer customer);
	
	public Customer findById(int id);
	
	public void deleteCustomer(int id);
}
