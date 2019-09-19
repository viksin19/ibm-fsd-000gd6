package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String pname;
	private String dname;
	private String desiese;

	

	public Appointment(int id, String pname, String dname, String desiese) {
		super();
		this.id = id;
		this.pname = pname;
		this.dname = dname;
		this.desiese = desiese;
	}

	public Appointment() {
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

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDesiese() {
		return desiese;
	}

	public void setDesiese(String desiese) {
		this.desiese = desiese;
	}

}
