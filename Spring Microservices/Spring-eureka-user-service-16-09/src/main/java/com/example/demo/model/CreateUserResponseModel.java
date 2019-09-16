package com.example.demo.model;

public class CreateUserResponseModel {
private String fname;
private String lname;
private String email;
public CreateUserResponseModel(String fname, String lname, String email) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.email = email;
}
public CreateUserResponseModel() {
	super();
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
