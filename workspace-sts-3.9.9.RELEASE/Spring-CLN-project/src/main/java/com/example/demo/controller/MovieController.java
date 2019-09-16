package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.Repo.BookingRepo;
import com.example.demo.Repo.MovieRepo;

@Controller
public class MovieController {

	private MovieRepo movieRepo;
	private BookingRepo bookingRepo;
	@Autowired
	public MovieController(MovieRepo movieRepo, BookingRepo bookingRepo) {
		super();
		this.movieRepo = movieRepo;
		this.bookingRepo = bookingRepo;
	}

	

}
