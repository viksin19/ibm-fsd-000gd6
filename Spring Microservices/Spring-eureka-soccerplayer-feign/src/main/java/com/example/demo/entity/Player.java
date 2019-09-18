package com.example.demo.entity;

public class Player {
private int id;
private String fname;
private String lname;
private int noOfmatchesPlayed;
private String country;
public Player(String fname, String lname, int noOfmatchesPlayed, String country) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.noOfmatchesPlayed = noOfmatchesPlayed;
	this.country = country;
	
}
public Player() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public int getNoOfmatchesPlayed() {
	return noOfmatchesPlayed;
}
public void setNoOfmatchesPlayed(int noOfmatchesPlayed) {
	this.noOfmatchesPlayed = noOfmatchesPlayed;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}



}
