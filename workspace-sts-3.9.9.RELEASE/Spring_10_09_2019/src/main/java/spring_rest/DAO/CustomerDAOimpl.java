package spring_rest.DAO;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import spring_rest.entity.Customer;
@Repository
public class CustomerDAOimpl implements CustomerDAO {
    @Autowired
    private SessionFactory sessionFactory;
    private Session session;
    
    @PostConstruct
    public void init() {
    	session = sessionFactory.openSession();
    }
	@Override
	@Transactional
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		Query query = session.createQuery("from Customer",Customer.class);
		
		return query.getResultList();
	}

	@Override
	@Transactional
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		session = sessionFactory.getCurrentSession();
		System.out.println(customer);
		session.save(customer);

	}

	@Override
	@Transactional
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		session = sessionFactory.getCurrentSession();
         session.merge(customer);
	}

	@Override
	@Transactional
	public Customer findById(int id) {
		// TODO Auto-generated method stub
		session = sessionFactory.getCurrentSession();
		Customer customer = session.find(Customer.class, id);
		return customer ;
	}

	@Override
	@Transactional
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		session = sessionFactory.getCurrentSession();
		Customer obj = session.find(Customer.class, id);
		session.delete(obj);

	}
	@PreDestroy
	public void destroy()
	{
		session.close();
	}

}
