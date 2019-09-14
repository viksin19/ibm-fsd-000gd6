package employeedao;

import java.util.List;

import employee.Employee;

public interface EmployeeDao {
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public void deleteEmployee(int id);
	public boolean searchemployee(int id);
}