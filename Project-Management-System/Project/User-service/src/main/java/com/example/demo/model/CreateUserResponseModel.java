package com.example.demo.model;

public class CreateUserResponseModel {
	private String username;
	private String password;
	private String ulocation;
	private String avialability;
	private String email;
	private String img;
	private String udomain;
	private String previous_project;
	private Long projectid;
	private Long taskId;
	
	public CreateUserResponseModel() {
		super();
	}
	
	public CreateUserResponseModel(String username, String password, String ulocation, String avialability, String email,
			String img, String udomain, String previous_project, Long projectid, Long taskId) {
		super();
		this.username = username;
		this.password = password;
		this.ulocation = ulocation;
		this.avialability = avialability;
		this.email = email;
		this.img = img;
		this.udomain = udomain;
		this.previous_project = previous_project;
		this.projectid = projectid;
		this.taskId = taskId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getUdomain() {
		return udomain;
	}

	public void setUdomain(String udomain) {
		this.udomain = udomain;
	}

	public String getPrevious_project() {
		return previous_project;
	}

	public void setPrevious_project(String previous_project) {
		this.previous_project = previous_project;
	}

	public Long getProjectid() {
		return projectid;
	}

	public void setProjectid(Long projectid) {
		this.projectid = projectid;
	}

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	@Override
	public String toString() {
		return "CreateUserResponseModel [username=" + username + ", password=" + password + ", ulocation=" + ulocation
				+ ", avialability=" + avialability + ", email=" + email + ", img=" + img + ", udomain=" + udomain
				+ ", previous_project=" + previous_project + ", projectid=" + projectid + ", taskId=" + taskId + "]";
	}
	
}
