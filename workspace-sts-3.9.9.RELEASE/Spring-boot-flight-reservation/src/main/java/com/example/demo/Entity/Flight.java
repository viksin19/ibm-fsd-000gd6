package com.example.demo.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String airline;
	private String source;
	private String destination;
	@ManyToMany
	@JoinTable(name = "flight_passenger",joinColumns = @JoinColumn(name ="flight_id" ),
	inverseJoinColumns = @JoinColumn(name="passenger_id"))
	private Set<Passenger> passengers = new HashSet<Passenger>();
	public Flight(String airline, String source, String destination) {
		super();
		this.airline = airline;
		this.source = source;
		this.destination = destination;
	}
	public Flight(String airline, String source, String destination, Set<Passenger> passengers) {
		super();
		this.airline = airline;
		this.source = source;
		this.destination = destination;
		this.passengers = passengers;
	}
	public Flight() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Set<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(Set<Passenger> passengers) {
		this.passengers = passengers;
	}
	
	
	
}
