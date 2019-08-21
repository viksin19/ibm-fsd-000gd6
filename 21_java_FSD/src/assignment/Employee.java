package assignment;

import java.util.Date;

public class Employee implements Comparable<Employee> {

	private static int id=0;
	private int currid;
	private String name;
    private String department;
    private Date dtaeofjoining;
    private int age , salary;
    
    

	public Employee() {
		super();
	
	}




	public Employee(String name, String department, Date dtaeofjoining, int age, int salary) {
		super();
		++id;
		currid=id;
		this.name = name;
		this.department = department;
		this.dtaeofjoining = dtaeofjoining;
		this.age = age;
		this.salary = salary;
	}

public int getId() {
	return currid;
}


	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getDepartment() {
		return department;
	}




	public void setDepartment(String department) {
		this.department = department;
	}




	public Date getDtaeofjoining() {
		return dtaeofjoining;
	}




	public void setDtaeofjoining(Date dtaeofjoining) {
		this.dtaeofjoining = dtaeofjoining;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public int getSalary() {
		return salary;
	}




	public void setSalary(int salary) {
		this.salary = salary;
	}




	@Override
	public String toString() {
		return "Employee [Id="+id + "name=" + name + ", department=" + department + ", dtaeofjoining=" + dtaeofjoining + ", age="
				+ age + ", salary=" + salary + "]";
	}




	@Override
	public int compareTo(Employee o1) {
	if(this.getSalary()== o1.getSalary()) {
		return 0;
	}else if(this.getSalary()>o1.getSalary()) {
		return 1;
	}else {
		return -1;
	}
	}




	
}
