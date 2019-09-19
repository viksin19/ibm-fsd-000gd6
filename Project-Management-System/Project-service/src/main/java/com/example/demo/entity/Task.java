package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String tname;

	
	private String task_owner;

	private Date start_date;
	private Date end_date;
	private String status;
	private String requirement_domain;

	public Task(String tname, Date start_date,String task_owner, Date end_date, String status, String requirement_domain) {
		super();
		this.tname = tname;
		this.task_owner=task_owner;
		this.start_date = start_date;
		this.end_date = end_date;
		this.status = status;
		this.requirement_domain = requirement_domain;
	}

	public String getRequirement_domain() {
		return requirement_domain;
	}

	public void setRequirement_domain(String requirement_domain) {
		this.requirement_domain = requirement_domain;
	}

	public Task() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}
     
	public String getTask_owner() {
		return task_owner;
	}

	public void setTask_owner(String task_owner) {
		this.task_owner = task_owner;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
