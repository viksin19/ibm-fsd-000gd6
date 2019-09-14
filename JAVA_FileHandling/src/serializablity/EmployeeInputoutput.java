package serializablity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeInputoutput {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		Emplyee emp = new Emplyee(10,"sachin",20000,"mumbai");
		System.out.println("Employee to write is : "+emp);
		
		FileOutputStream out = new FileOutputStream("employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(out);
		oos.writeObject(emp);
		oos.flush();
		
		 FileInputStream in = new FileInputStream("employee.txt");
		 
		 ObjectInputStream iin = new ObjectInputStream(in);
		 emp =(Emplyee)(iin.readObject());
		 
		 System.out.println("Employee Read is : "+emp);
		 

	}

}
