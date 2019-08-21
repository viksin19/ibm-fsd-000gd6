package assignment;

import java.util.Scanner;

public class Passmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MyuserCode pass = new MyuserCode();
     String password;
     Scanner scanner = new Scanner(System.in);
     password = scanner.next();
     pass.checkpassword(password);
	}

}
