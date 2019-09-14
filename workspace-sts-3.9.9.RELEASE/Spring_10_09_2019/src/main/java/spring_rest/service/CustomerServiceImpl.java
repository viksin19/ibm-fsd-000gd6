package spring_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring_rest.DAO.CustomerDAO;
import spring_rest.entity.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDAO dao;

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return dao.getAllCustomer();
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
           dao.addCustomer(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
           dao.updateCustomer(customer);
	}

	@Override
	public Customer findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
      dao.deleteCustomer(id);
	}

}
