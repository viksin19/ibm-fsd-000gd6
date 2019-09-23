package com.example.demo.shared;

import java.util.Date;

public class ProjectDto {

	private String pid;
	private String pname;
	private String plocation;
	private Date start_date;
	private Date end_date;
	private String pmanager;
	private String sDate;
	private String eDate;
	private int task_id;

	public ProjectDto() {
		super();
	}

	public ProjectDto(String pid, String pname, String plocation, Date start_date, Date end_date, String pmanager) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
		this.start_date = start_date;
		this.end_date = end_date;
		this.pmanager = pmanager;

	}

	public ProjectDto(String pid, String pname, String plocation, String sDate, String eDate, String pmanager) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
		this.pmanager = pmanager;
		this.sDate = sDate;
		this.eDate = eDate;
	}
	

	public ProjectDto(String pid, String pname, String plocation, Date start_date, Date end_date, String pmanager,
			int task_id) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
		this.start_date = start_date;
		this.end_date = end_date;
		this.pmanager = pmanager;
		this.task_id = task_id;
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

	public String getPmanager() {
		return pmanager;
	}

	public void setPmanager(String pmanager) {
		this.pmanager = pmanager;
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

	public int getTask_id() {
		return task_id;
	}

	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}

}
