package comm.bean.DAO;

import java.util.List;

import comm.customer.entity.Customer;

public interface CustomerDao {

	public void createCustomer(Customer customer);

	public List<Customer> getCustomer();

	public void saveCustomer(Customer customer);
	
	public void deletecustomer(int id);
	
	public void update(Customer customer);
	
	public Customer find(int id);
	
	public List<Customer> searchbyfname(String searchkey);
	public List<Customer> searchbylname(String searchkey);
	public List<Customer> searchbyemail(String searchkey);
}
