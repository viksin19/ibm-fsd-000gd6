package com.example.demo.entity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project {

	private String sDate;
	private String eDate;
	@OneToMany(mappedBy = "project",fetch = FetchType.LAZY)
	private List<User> users = new ArrayList<User>();

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Task> task = new ArrayList<Task>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "pid")
	private String pid;
	@Column(name = "pname")
	private String pname;
	@Column(name = "plocation")
	private String plocation;
	@Column(name = "start_date")
	private Date start_date;
	@Column(name = "end_date")
	private Date end_date;
	@Column(name = "pmanager")
	private String pmanager;
	@Column(name = "task_id")
	private Long task_id;

	
	public Project(String pid, String pname, String plocation, String pmanager, String startDate, String endDate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
		this.pmanager = pmanager;
		this.sDate = startDate;
		this.eDate = endDate;
	}
	
	public Project(String pname, String plocation, String startDate, String endDate, String pmanager) {
		super();
		this.pname = pname;
		this.plocation = plocation;
		this.pmanager = pmanager;
		this.sDate = startDate;
		this.eDate = endDate;
	}
	
	public Project(String pid, String pname, String plocation, Date start_date, Date end_date, String pmanager, Long task_id) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
		this.start_date = start_date;
		this.end_date = end_date;
		this.pmanager = pmanager;
		this.task_id = task_id;
	}

	public Project(String pid, String pname, String plocation, Date start_date, Date end_date, String pmanager) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
		this.start_date = start_date;
		this.end_date = end_date;
		this.pmanager = pmanager;
	}

	public Project(String pid, String pname, String plocation, Date start_date, Date end_date, String pmanager,
			List<User> users, List<Task> tasks) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
		this.start_date = start_date;
		this.end_date = end_date;
		this.pmanager = pmanager;
		this.users = users;
		this.task = tasks;
	}

	public Project(String pname, String plocation, Date start_date, Date end_date, String pmanager) {
		super();
		this.pname = pname;
		this.plocation = plocation;
		this.start_date = start_date;
		this.end_date = end_date;
		this.pmanager = pmanager;
	}

	public Project() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Task> getTasks() {
		return task;
	}

	public void setTasks(List<Task> tasks) {
		this.task = tasks;
	}

	public String getStartDate() {
		return sDate;
	}

	public void setStartDate(String startDate) {
		this.sDate = startDate;
	}

	public String getEndDate() {
		return eDate;
	}

	public void setEndDate(String endDate) {
		this.eDate = endDate;
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

	public List<Task> getTask() {
		return task;
	}

	public void setTask(List<Task> task) {
		this.task = task;
	}

	public Long getTask_id() {
		return task_id;
	}

	public void setTask_id(Long task_id) {
		this.task_id = task_id;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", pid=" + pid + ", pname=" + pname + ", plocation=" + plocation + ", start_date="
				+ start_date + ", end_date=" + end_date + ", pmanager=" + pmanager + ", sDate=" + sDate + ", eDate="
				+ eDate + ", task=" + task + "]";
	}
	

}
