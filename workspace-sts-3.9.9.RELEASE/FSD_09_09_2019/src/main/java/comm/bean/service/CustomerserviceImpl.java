package comm.bean.service;
import comm.bean.DAO.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import comm.customer.entity.Customer;
@Service
public class CustomerserviceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerdao;
	
	@Transactional
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return customerdao.getCustomer();
	}
   @Transactional
	public void savecustomer(Customer customer) {
		customerdao.saveCustomer(customer);

	}
   //@Transactional
public void deletecustomer(int id) {
	// TODO Auto-generated method stub
	customerdao.deletecustomer(id);
}


public void update(Customer customer) {
	// TODO Auto-generated method stub
	 customerdao.update(customer);
}
public Customer find(int id) {
	// TODO Auto-generated method stub
	return customerdao.find(id);
}
public List<Customer> searchbyfname(String searchkey) {
	// TODO Auto-generated method stub
	return customerdao.searchbyfname(searchkey);
}
public List<Customer> searchbylname(String searchkey) {
	// TODO Auto-generated method stub
	return customerdao.searchbylname(searchkey);
}
public List<Customer> searchbyemail(String searchkey) {
	// TODO Auto-generated method stub
	return customerdao.searchbyemail(searchkey);
}

}
