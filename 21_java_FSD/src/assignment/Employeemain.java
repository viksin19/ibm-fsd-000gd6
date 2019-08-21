package assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Employeemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the Number of Employees : ");
		Scanner scanner = new Scanner(System.in);
		int empno =  scanner.nextInt();
		
		Employee empobj[]= new Employee[empno];
		for(int i=0;i<empno;i++) {
			
			try {
			System.out.println(" Enter the details of Employee "+(i+1));
			System.out.print("Name : ");
			String name = scanner.next();
			System.out.print("Department : ");
			String department = scanner.next();
			System.out.print("DOJ : ");
			String doj = scanner.next();
			SimpleDateFormat format = new SimpleDateFormat();
			Date dateofjoining = null;
			    try {
				 dateofjoining = format.parse(doj);}catch(ParseException e) {
					
				}
		
			System.out.print("Enter Age : ");
			int age = scanner.nextInt();
			System.out.print("Enter Salary : ");
			int salary = scanner.nextInt();
			
			empobj[i]= new Employee(name,department,dateofjoining,age,salary);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("1. Sort by Salary ");
		System.out.println("2. Sort by Age and by Dateofjoining ");
		System.out.print("choose your choice : ");
		
		List<Employee> list = new ArrayList<Employee>();
		for(int i=0;i<empno;i++) {
			list.add(empobj[i]);
		}
		EmployeeBO disp = new EmployeeBO();
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			disp.printEmployee(list);
			break;
		case 2:
			Collections.sort(list,new AgeComprator());
			disp.printEmployee(list);
			break;
			default :
				System.out.println("Invalid choice !!!");
			
		}
	}

}
