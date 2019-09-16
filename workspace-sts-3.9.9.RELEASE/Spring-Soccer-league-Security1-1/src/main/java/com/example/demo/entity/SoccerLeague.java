package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SoccerLeague {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id; 
private String name;
private int year;
public SoccerLeague(String name, int year) {
	super();
	this.name = name;
	this.year = year;
}
public SoccerLeague() {
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
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}



}
