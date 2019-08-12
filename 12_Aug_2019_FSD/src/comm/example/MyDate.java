package comm.example;

public class MyDate {
  private int day;
  private int month;
  private int year;
  
 
  
  public MyDate() {
	this(1);
}

public MyDate(int day) {
	this(day,1);
}

public MyDate(int day, int month) {
	this(day,month,2000);
}

public MyDate(int day, int month, int year) {
	this.day = day;
	this.month = month;
	this.year = year;
}

public void createDate(int d, int m, int y) {
	  if(d>30 || m>12 ) {
		  System.out.println("Inavlid Date Value !!");
		  System.exit(0);
	  }else if(y<1990 || y>2019) {
		  System.out.println("Invalid Year is Entered !!");
		  System.exit(0);
	  }else {
		  day = d;
		  month =m;
		  year =y;
	  }
  }
  
  public String getDetails() {
	  return day+"-"+month+"-"+year ;
  }
  
}
