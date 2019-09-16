package com.example.demo.Dto;

import java.util.UUID;

public class UserDto {
	private int user_id;
	private String fname;
	private String lname;
	private String email;
	private String password;
	public UserDto() {
		super();
	}
	public UserDto( String fname, String lname, String email, String password) {
		super();
		this.user_id = Integer.parseInt(UUID.randomUUID().toString());
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
