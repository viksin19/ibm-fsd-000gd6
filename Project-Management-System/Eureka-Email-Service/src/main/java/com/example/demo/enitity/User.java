package com.example.demo.enitity;

public class User {
private String name;
private String email;
private String password;
private int age;
private String location;
private String domain;
private String status;
public User(String name, String email, String password, int age, String location, String domain) {
	super();
	this.name = name;
	this.email = email;
	this.password = password;
	this.age = age;
	this.location = location;
	this.domain = domain;
	
}
public User() {
	super();
	this.status="free";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getDomain() {
	return domain;
}
public void setDomain(String domain) {
	this.domain = domain;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

}
