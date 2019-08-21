package JDBV_20;

import java.sql.SQLException;
import java.util.List;

import employee.Employee;
import employeedao.EmployeeDao;
import employeedao.EmployeeDaoimpl;

public class Employeeserviceimpl implements Employeeservice {
      private EmployeeDao dao= null;
      
	public Employeeserviceimpl() throws SQLException {
		super();
		dao = new EmployeeDaoimpl();
	}

	@Override
	public void createEmployee(Employee employee) {
		dao.createEmployee(employee);

	}

	@Override
	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}

	@Override
	public void deleteEmployee(int id) {
	  dao.deleteEmployee(id);
		
	}

}
