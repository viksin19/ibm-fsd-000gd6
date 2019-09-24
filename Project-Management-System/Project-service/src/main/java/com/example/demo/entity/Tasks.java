package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Tasks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int taskId;
	private String taskName;
	private String taskLeader;
	private String startDate;
	private String endDate;
	private String status;
	@Transient
	private int pid;	
	@ManyToOne
	private Project project;
	
	public Tasks() {
		super();
	}
	
	public Tasks(String taskName, String taskLeader, String startDate, String endDate, String status) {
		super();
		this.taskName = taskName;
		this.taskLeader = taskLeader;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskLeader() {
		return taskLeader;
	}

	public void setTaskLeader(String taskLeader) {
		this.taskLeader = taskLeader;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	
}