package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Booking {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int price;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable=false)
    private User user;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "movie_id", nullable=false)
	private Movie movie;
	
	public Booking(int price) {
		super();
		this.price = price;
	}
	
	public Booking(int price, Movie movie) {
		super();
		this.price = price;
		this.movie = movie;
	}

	public Movie getMovie() {
		return movie;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Booking() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
