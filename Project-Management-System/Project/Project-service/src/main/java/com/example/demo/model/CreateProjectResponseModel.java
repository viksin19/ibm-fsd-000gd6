package com.example.demo.model;

public class CreateProjectResponseModel {
	
	private String pname;
	private String plocation;
	private String start_date;
	private String end_date;
	private String pmanager;
	
	public CreateProjectResponseModel() {
		super();
	}

	public CreateProjectResponseModel(String pname, String plocation, String start_date, String end_date,
			String pmanager) {
		super();
		this.pname = pname;
		this.plocation = plocation;
		this.start_date = start_date;
		this.end_date = end_date;
		this.pmanager = pmanager;
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

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getPmanager() {
		return pmanager;
	}

	public void setPmanager(String pmanager) {
		this.pmanager = pmanager;
	}

	@Override
	public String toString() {
		return "CreateProjectResponseModel [pname=" + pname + ", plocation=" + plocation + ", start_date=" + start_date
				+ ", end_date=" + end_date + ", pmanager=" + pmanager + "]";
	}


}
