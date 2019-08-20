package comm.example;

public class Person {
private String name;
private String address;
public Person() {
	System.out.println("inside Default constructor !!");
}
public Person(String name, String address) {
	
	this.name = name;
	this.address = address;
}

public void  setDetails(String n, String a) {
	name = n;
	address= a;
}

protected String getDetails() {
	return "Name : "+name+" Address : "+address;
}



}
