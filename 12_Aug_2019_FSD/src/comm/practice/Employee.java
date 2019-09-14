package comm.practice;

public class Employee {
	private int EmpId;
	private String EmpName;
	public Employee() {
	
	}
	public Employee(int empId, String empName) {

		EmpId = empId;
		EmpName = empName;
	}
	
	protected String getDetails() {
		return "Employee ID : "+EmpId+" || Employee Name : "+EmpName;
		}
	
	

}
