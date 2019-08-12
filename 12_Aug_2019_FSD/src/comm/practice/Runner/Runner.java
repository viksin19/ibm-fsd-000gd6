package comm.practice.Runner;
import  comm.practice.MyDate;
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MyDate	mydate = new MyDate();
     
     if(mydate.setDay(14)) {
    	 System.out.println("Day : "+mydate.getDay());
     }else {
    	 System.out.println("Invalid day Entered !!");
     }
     
     if(mydate.setMonth(14)) {
    	 System.out.println("Month : "+mydate.getMonth());
     }else {
    	 System.out.println("Invalid Month Entered !!");
     }
     
     if(mydate.setYear(2014)) {
    	 System.out.println("year : "+mydate.getYear());
     }else {
    	 System.out.println("Invalid year Entered !!");
     }

	}

}
