package JDBV_20;

import java.util.List;

import employee.Employee;

public interface Employeeservice {
	
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public void deleteEmployee(int id);
	public boolean searchemployee(int id);
  
}
