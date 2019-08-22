package FileToDatabase;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import JDBV_20.Employeeserviceimpl;
import employee.Employee;

public class FileEmployee {
 public static void main(String args[]) throws IOException, SQLException {
	Employeeserviceimpl empservice = new Employeeserviceimpl();
	int id;
	String name;
	String address;
	Scanner scanner = new Scanner(System.in);
	int choice;
	System.out.println(" 1. Put Data From file to Databasae : ");
	System.out.println("2. get Data from database to file");
	choice = scanner.nextInt();
	switch(choice) {
	case 1:
		BufferedReader reader = new BufferedReader(new FileReader("employee.txt"));
		String line;
		while((line = reader.readLine())!=null) {
			String arr[]= line.split(" ", 4);
			id = Integer.parseInt(arr[0]);
			name = arr[1];
			address = arr[2];
			empservice.createEmployee(new Employee(id,name,address));
			} reader.close();
		break;
	case 2:
		BufferedWriter writer = new BufferedWriter(new FileWriter("employyout.txt"));
		List<Employee> list = new ArrayList();
		list = empservice.getAllEmployees();
		for(Employee l:list) {
			String str = l.getId()+" "+l.getFirstname()+" "+l.getEmail()+"\n";
			writer.write(str);
			System.out.println(str);
		}
		
		break;
		default :
			System.out.println("Invalid Choice ");
	}
	
	}
	
 }	

