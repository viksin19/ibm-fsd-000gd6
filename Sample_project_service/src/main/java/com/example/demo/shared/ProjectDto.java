package com.example.demo.shared;

import java.util.Date;

public class ProjectDto {

	private String pname;
	private String plocation;
	private Date start_date;
	private Date end_date;
	private String pmanager;
	private String sDate;
	private String eDate;
	private int pid;
	private int uid;
	private int tid;

	public ProjectDto() {
		super();
	}



	public ProjectDto(String pname, String plocation, String pmanager, String sDate, String eDate, int pid, int uid,
			int tid) {
		super();
		this.pname = pname;
		this.plocation = plocation;
		this.pmanager = pmanager;
		this.sDate = sDate;
		this.eDate = eDate;
		this.pid = pid;
		this.uid = uid;
		this.tid = tid;
	}
	
	public ProjectDto(String pname, String plocation, Date start_date, Date end_date, String pmanager, int pid, int uid,
			int tid) {
		super();
		this.pname = pname;
		this.plocation = plocation;
		this.start_date = start_date;
		this.end_date = end_date;
		this.pmanager = pmanager;
		this.pid = pid;
		this.uid = uid;
		this.tid = tid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
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

}
