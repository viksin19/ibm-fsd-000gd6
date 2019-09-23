package com.example.demo.model;

import java.util.Date;

public class CreateProjectRequestModel {

	private String pname;
	private String plocation;
	private Date start_date;
	private Date end_date;
	private String sDate;
	private String eDate;
	private String pmanager;
	private int task_id;

	public CreateProjectRequestModel() {
		super();
	}

	public CreateProjectRequestModel(String pname, String plocation, Date start_date, Date end_date, String sDate,
			String eDate, String pmanager, int task_id) {
		super();
		this.pname = pname;
		this.plocation = plocation;
		this.start_date = start_date;
		this.end_date = end_date;
		this.sDate = sDate;
		this.eDate = eDate;
		this.pmanager = pmanager;
		this.task_id = task_id;
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

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public String getsDate() {
		return sDate;
	}

	public void setsDate(String sDate) {
		this.sDate = sDate;
	}

	public String geteDate() {
		return eDate;
	}

	public void seteDate(String eDate) {
		this.eDate = eDate;
	}

	public String getPmanager() {
		return pmanager;
	}

	public void setPmanager(String pmanager) {
		this.pmanager = pmanager;
	}

	public int getTask_id() {
		return task_id;
	}

	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}

}
