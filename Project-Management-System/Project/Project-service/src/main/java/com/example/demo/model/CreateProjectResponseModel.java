package com.example.demo.model;

public class CreateProjectResponseModel {
	
	private String pname;
	private String plocation;
	private String start_date;
	private String end_date;
	private String pmanagerName;
	private String pmanagerEmail;
	
	public CreateProjectResponseModel() {
		super();
	}
	
	public CreateProjectResponseModel(String pname, String plocation, String start_date, String end_date,
			String pmanagerName, String pmanagerEmail) {
		super();
		this.pname = pname;
		this.plocation = plocation;
		this.start_date = start_date;
		this.end_date = end_date;
		this.pmanagerName = pmanagerName;
		this.pmanagerEmail = pmanagerEmail;
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

	public String getPmanagerName() {
		return pmanagerName;
	}

	public void setPmanagerName(String pmanagerName) {
		this.pmanagerName = pmanagerName;
	}

	public String getPmanagerEmail() {
		return pmanagerEmail;
	}

	public void setPmanagerEmail(String pmanagerEmail) {
		this.pmanagerEmail = pmanagerEmail;
	}

	@Override
	public String toString() {
		return "CreateProjectResponseModel [pname=" + pname + ", plocation=" + plocation + ", start_date="
				+ start_date + ", end_date=" + end_date + ", pmanagerName=" + pmanagerName + ", pmanagerEmail="
				+ pmanagerEmail + "]";
	}


}
