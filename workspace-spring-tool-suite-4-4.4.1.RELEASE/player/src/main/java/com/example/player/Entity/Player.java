package com.example.player.Entity;

import org.springframework.stereotype.Component;

@Component
public class Player {
	private int Id;
	private String Name;
	private String country;
	public Player() {
		super();
		
	}
	public Player(int id, String name, String country) {
		super();
		Id = id;
		Name = name;
		this.country = country;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
