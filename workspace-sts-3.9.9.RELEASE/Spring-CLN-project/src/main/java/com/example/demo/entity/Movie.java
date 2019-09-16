package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int releaseYear;
	private int rating;
	private String url;
	private String type;
	private String description;
	private int price;
	@OneToMany(cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			mappedBy = "movie")
	private List<Booking> bookings;
	
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public List<Booking> getBooking() {
		return bookings;
	}
	public void setBooking(List<Booking> booking) {
		this.bookings = booking;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<Booking> getBookings() {
		return bookings;
	}
	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}
	public Movie(String name, int releaseYear, int rating, String url, String type, String description, int price) {
		super();
		this.name = name;
		this.releaseYear = releaseYear;
		this.rating = rating;
		this.url = url;
		this.type = type;
		this.description = description;
		this.price = price;
	}
	public Movie(String name, int releaseYear, int rating, String type, String description, int price) {
		super();
		this.name = name;
		this.releaseYear = releaseYear;
		this.rating = rating;
		this.type = type;
		this.description = description;
		this.price = price;
	}
	public Movie() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
