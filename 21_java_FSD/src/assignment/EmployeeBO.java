package assignment;

import java.util.List;

public class EmployeeBO {

	public static void printEmployee(List<Employee> list) {
		System.out.println(" EMPid  Name  Department   Doj   Age  Salary");
		for(Employee e:list) {
		
			System.out.printf("%-15s%-30s%-30s%-10s%-10s\n",e.getId(),e.getName(),e.getDepartment(),e.getDtaeofjoining(),e.getAge(),e.getSalary());
		}
	}
}
