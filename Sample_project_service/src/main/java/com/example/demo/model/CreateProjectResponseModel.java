package com.example.demo.model;

public class CreateProjectResponseModel {
	
	private String pid;
	private String pname;
	private String plocation;
	private String pmanager;
	
	public CreateProjectResponseModel() {
		super();
	}

	public CreateProjectResponseModel(String pid, String pname, String plocation, String pmanager) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
		this.pmanager = pmanager;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPlocation() {
		return plocation;
	}

	public void setPlocation(String plocation) {
		this.plocation = plocation;
	}

	public String getPmanager() {
		return pmanager;
	}

	public void setPmanager(String pmanager) {
		this.pmanager = pmanager;
	}
	

}
