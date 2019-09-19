package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.springframework.scheduling.config.Task;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String username;
	private String ulocation;
	private String avialability;
	private String email;
	private String img;
	private String udomain;

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Task task;

	@ManyToMany
	@JoinTable(name = "project_user",
	joinColumns = @JoinColumn(name="user_id" ),
	inverseJoinColumns = @JoinColumn(name="project_id"))
	private List<Project> previous_ptojects = new ArrayList<Project>();

	

	public User(String username, String ulocation, String avialability, String email, String img, String udomain) {
		super();
		this.username = username;
		this.ulocation = ulocation;
		this.avialability = avialability;
		this.email = email;
		this.img = img;
		this.udomain = udomain;
	}

	public String getUdomain() {
		return udomain;
	}

	public void setUdomain(String udomain) {
		this.udomain = udomain;
	}

	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUlocation() {
		return ulocation;
	}

	public void setUlocation(String ulocation) {
		this.ulocation = ulocation;
	}

	public String getAvialability() {
		return avialability;
	}

	public void setAvialability(String avialability) {
		this.avialability = avialability;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public List<Project> getPrevious_ptoject() {
		return previous_ptojects;
	}

	public void setPrevious_ptoject(List<Project> previous_ptoject) {
		this.previous_ptojects = previous_ptoject;
	}

	public User(String username, String ulocation, String avialability, String email, String img, Task task) {
		super();
		this.username = username;
		this.ulocation = ulocation;
		this.avialability = avialability;
		this.email = email;
		this.img = img;
		this.task = task;
	}

	public User(String username, String ulocation, String avialability, String email, String img, Task task,
			List<Project> previous_ptoject) {
		super();
		this.username = username;
		this.ulocation = ulocation;
		this.avialability = avialability;
		this.email = email;
		this.img = img;
		this.task = task;
		this.previous_ptojects = previous_ptoject;
	}
	
	
}
