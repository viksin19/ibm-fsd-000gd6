package com.example.demo.Entity;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	
	@JoinTable(name = "flight_passenger",joinColumns = @JoinColumn(name ="passenger_id" ),
	inverseJoinColumns = @JoinColumn(name="flight_id"))
	private Set<Flight> flights = new HashSet<Flight>();
	
	@OneToOne
	private Reservation reservation;
	public Passenger() {
		super();
	}
	public Passenger(String firstname, String lastname, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	public Passenger(String firstname, String lastname, String email, Set<Flight> flights) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.flights = flights;
	
	}
	public Passenger(String firstname, String lastname, String email, Set<Flight> flights,
			Reservation reservation) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.flights = flights;
		this.reservation = reservation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Flight> getFlights() {
		return flights;
	}
	public void setFlights(Set<Flight> flights) {
		this.flights = flights;
	}
	
	
	

}
