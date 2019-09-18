package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class SoccerLeague {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String leaguename;
	private String country;
	private int year;
	public SoccerLeague(String leaguename, String country, int year) {
		super();
		this.leaguename = leaguename;
		this.country = country;
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
	public String getLeaguename() {
		return leaguename;
	}
	public void setLeaguename(String leaguename) {
		this.leaguename = leaguename;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	

}
