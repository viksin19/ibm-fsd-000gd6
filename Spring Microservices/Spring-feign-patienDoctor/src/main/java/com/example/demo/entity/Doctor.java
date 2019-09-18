package com.example.demo.entity;

public class Doctor {
private int id;
private String name;
private String city;
private String speciality;
public Doctor(String name, String city, String speciality) {
	super();
	this.name = name;
	this.city = city;
	this.speciality = speciality;
}
public Doctor() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getSpeciality() {
	return speciality;
}
public void setSpeciality(String speciality) {
	this.speciality = speciality;
}


}
