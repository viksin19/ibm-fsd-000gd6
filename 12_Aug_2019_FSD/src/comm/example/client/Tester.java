<<<<<<< HEAD
package comm.example.client;
import comm.example.MyDate;
public class Tester {

	public static void main(String[] args) {
		MyDate myDate = null;
		myDate = new MyDate();
		System.out.println("Intial Date-Month-Year : "+myDate.getDetails());
		myDate.createDate(25,1,2016);
		String date = myDate.getDetails();
		System.out.println(date);
		
		myDate.createDate(12,1,2020);
		 date = myDate.getDetails();
		System.out.println(date);
		

	}

}
=======
package comm.example.client;
import comm.example.MyDate;
public class Tester {

	public static void main(String[] args) {
		MyDate myDate = null;
		myDate = new MyDate();
		System.out.println("Intial Date-Month-Year : "+myDate.getDetails());
		myDate.createDate(25,1,2016);
		String date = myDate.getDetails();
		System.out.println(date);
		
		myDate.createDate(12,1,2020);
		 date = myDate.getDetails();
		System.out.println(date);
		

	}

}
>>>>>>> 2864f15d73c947a8aec49c905b317c863649166d
