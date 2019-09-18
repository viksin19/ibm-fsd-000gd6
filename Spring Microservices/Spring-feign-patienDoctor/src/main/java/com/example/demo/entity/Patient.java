package com.example.demo.entity;

public class Patient {
	private int id;
	private String name;
	private String city;
	private int age;
	private String desiese;
	public Patient(String name, String city, int age, String desiese) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
		this.desiese = desiese;
	}
	public Patient() {
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesiese() {
		return desiese;
	}
	public void setDesiese(String desiese) {
		this.desiese = desiese;
	}

}
