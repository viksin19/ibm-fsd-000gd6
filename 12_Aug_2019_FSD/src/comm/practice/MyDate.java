<<<<<<< HEAD
package comm.practice;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public boolean setDay( int d) {
		if(d>30) {
			return false;
		}else {
			day = d;
			return true;
		}
	}
	public boolean setMonth(int m) {
		if(m>12) {
			return false;
		}else {
			month = m;
			return true;
		}
	}
	public boolean setYear(int y) {
		if(y>2019 || y<1980) {
			return false;
		}else {
			year = y;
			return true;
		}
	}
	
	
}
=======
package comm.practice;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public boolean setDay( int d) {
		if(d>30) {
			return false;
		}else {
			day = d;
			return true;
		}
	}
	public boolean setMonth(int m) {
		if(m>12) {
			return false;
		}else {
			month = m;
			return true;
		}
	}
	public boolean setYear(int y) {
		if(y>2019 || y<1980) {
			return false;
		}else {
			year = y;
			return true;
		}
	}
	
	
}
>>>>>>> 2864f15d73c947a8aec49c905b317c863649166d
