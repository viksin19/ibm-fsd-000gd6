package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Contactmain {

	public static void main(String[] args) {
	System.out.print("Enter the number of Contacts : ");
	Scanner scanner = new Scanner(System.in);
	int contactno = scanner.nextInt();
	 
	List<Contact> list = new ArrayList();
	for(int i=0;i<contactno;i++) {
		System.out.println("\n Enter Details of Contact  "+i);
		System.out.println("Name : ");
		String name = scanner.next();
		System.out.println("Email : ");
		String email = scanner.next();
		System.out.println("Name : ");
	     long  mobile = scanner.nextLong();
		System.out.println("Address : ");
		String address = scanner.next();
		
		list.add(new Contact(name,email,mobile,address));		
	}
	Collections.sort(list);
	
	for (Contact l:list) {
		System.out.printf("%s   %s   %d   %s \n",l.getName(),l.getEmail(),l.getMobile(),l.getAddress());
	}

	}

}
