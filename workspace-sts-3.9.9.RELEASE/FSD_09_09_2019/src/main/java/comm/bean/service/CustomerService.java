package comm.bean.service;
import java.util.List;

import comm.customer.entity.*;
public interface CustomerService {
public List<Customer> getCustomer();
public void savecustomer(Customer customer);
public void deletecustomer(int id);
public void update(Customer customer);

public Customer find(int id);

public List<Customer> searchbyfname(String searchkey);
public List<Customer> searchbylname(String searchkey);
public List<Customer> searchbyemail(String searchkey);
}
