package com.example.task.data;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Setter
@Getter
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String taskname;
	private String taskowner;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "project_id" , nullable = true)
	private Project project;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id",nullable = true)
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	private User user;

	private Date start_date;
	private Date end_date;
	private String status;
	private String requirement_domain;
	
	@OneToMany(mappedBy = "tasks", cascade = CascadeType.ALL)
    private Set<Teams> teamsDetails;
	
	public Task(String tname, String task_owner, Date start_date, Date end_date, String status,
			String requirement_domain) {
		super();
		this.taskname = tname;
		this.taskowner = task_owner;
		this.start_date = start_date;
		this.end_date = end_date;
		this.status = status;
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
		return taskname;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public void setTname(String tname) {
		this.taskname = tname;
	}
	public String getTask_owner() {
		return taskowner;
	}
	public void setTask_owner(String task_owner) {
		this.taskowner = task_owner;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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
	public String getRequirement_domain() {
		return requirement_domain;
	}
	public void setRequirement_domain(String requirement_domain) {
		this.requirement_domain = requirement_domain;
	}

	
}