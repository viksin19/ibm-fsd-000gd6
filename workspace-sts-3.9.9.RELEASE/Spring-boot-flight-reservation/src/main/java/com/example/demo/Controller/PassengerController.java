package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Entity.Flight;
import com.example.demo.Entity.Passenger;
import com.example.demo.Entity.Reservation;
import com.example.demo.Repo.FlightRepo;
import com.example.demo.Repo.PassengerRepo;
import com.example.demo.Repo.ReservationRepo;

@Controller
@RequestMapping("/passenger")
public class PassengerController {
	
	
	private PassengerRepo passengerRepo;
	private FlightRepo flightRepo;
	private ReservationRepo reservationRepo;
	@Autowired
	public PassengerController(PassengerRepo passengerRepo, FlightRepo flightrepo, ReservationRepo reservationRepo) {
		super();
		this.passengerRepo = passengerRepo;
		this.flightRepo = flightrepo;
		this.reservationRepo = reservationRepo;
	}
	
	
	@GetMapping("/bookinglist")
	public String bookingresult(Model model) {
		model.addAttribute("passengers",passengerRepo.findAll() );
		return "booking_list";
	}
	@PostMapping("/book")
	public String bookform(@RequestParam("flightid") int id, Model model) {
		
		Passenger passenger = new Passenger();
	 
		model.addAttribute("passenger", passenger);
		model.addAttribute("flight", flightRepo.findById(id));
		
		return "passengerform";
	}
	@PostMapping("/save")
	public String savebooking(@ModelAttribute("passenger") Passenger thepassenger) {
		
		passengerRepo.save(thepassenger);
		
		for(Flight flight:thepassenger.getFlights()) {
			Reservation reservation = new Reservation();
			reservation.setPassenger(thepassenger);
			reservation.setFlight(flight);
			reservationRepo.save(reservation);
			
		}
		
		
		return "redirect:/passenger/bookinglist";
	}
	
	

}
