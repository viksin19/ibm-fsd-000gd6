package com.example.task.shared;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TeamsDto {

	private String userid;
	private String ufirstName;
	private String ulastName;
	private String uemail;
	private String uassigndate;
	private Integer taskid;
	private String ustatus;
	

	public TeamsDto() {
		super();
	}

	public TeamsDto(String userid, String ufirstName, String ulastName, String uemail, String uassigndate,
			String ustatus) {
		super();
		this.userid = userid;
		this.ufirstName = ufirstName;
		this.ulastName = ulastName;
		this.uemail = uemail;
		this.uassigndate = uassigndate;
		this.ustatus = ustatus;
	}
	
	public TeamsDto(String userid, String ufirstName, String ulastName, String uemail, String uassigndate,
			int taskid,String ustatus) {
		super();
		this.userid = userid;
		this.ufirstName = ufirstName;
		this.ulastName = ulastName;
		this.uemail = uemail;
		this.uassigndate = uassigndate;
		this.taskid = taskid;
		this.ustatus = ustatus;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUfirstName() {
		return ufirstName;
	}

	public void setUfirstName(String ufirstName) {
		this.ufirstName = ufirstName;
	}

	public String getUlastName() {
		return ulastName;
	}

	public void setUlastName(String ulastName) {
		this.ulastName = ulastName;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUassigndate() {
		return uassigndate;
	}

	public void setUassigndate(String uassigndate) {
		this.uassigndate = uassigndate;
	}

	public String getUstatus() {
		return ustatus;
	}

	public void setUstatus(String ustatus) {
		this.ustatus = ustatus;
	}

	public Integer getTaskid() {
		return taskid;
	}

	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}

	@Override
	public String toString() {
		return "TeamsDto [userid=" + userid + ", ufirstName=" + ufirstName + ", ulastName=" + ulastName + ", uemail="
				+ uemail + ", uassigndate=" + uassigndate + ", taskid=" + taskid + ", ustatus=" + ustatus + "]";
	}

}
