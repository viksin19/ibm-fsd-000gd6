package com.example.demo.Loder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.Flight;
import com.example.demo.Entity.Passenger;
import com.example.demo.Entity.Reservation;
import com.example.demo.Repo.FlightRepo;
import com.example.demo.Repo.PassengerRepo;
import com.example.demo.Repo.ReservationRepo;

@Component
public class Loder implements ApplicationListener<ContextRefreshedEvent>{
    
	private FlightRepo flightRepo;
	private PassengerRepo passengerRepo;
	private ReservationRepo reservationRepo;
	@Autowired
	public Loder(FlightRepo flightrepo, PassengerRepo passengerrepo, ReservationRepo reservationrepo) {
		super();
		this.flightRepo = flightrepo;
		this.passengerRepo = passengerrepo;
		this.reservationRepo = reservationrepo;
	}
	public Loder() {
		super();
	}
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}
	private void init() {
		// TODO Auto-generated method stub
		
		Flight flight = new Flight("Indigo","Banglore","Varanasi");
		Passenger vikram = new Passenger("vikram","singh","vik@gg.com");
		flight.getPassengers().add(vikram);
		passengerRepo.save(vikram);
		Passenger jai = new Passenger("jai","babu","jai@gg.com");
		
		flight.getPassengers().add(jai);
	     passengerRepo.save(jai);
		flightRepo.save(flight);
		Reservation res1 = new Reservation();
		res1.setFlight(flight);
		res1.setPassenger(jai);
		reservationRepo.save(res1);
		Reservation res2 = new Reservation();
		res2.setFlight(flight);
		res2.setPassenger(vikram);
		reservationRepo.save(res2);
		
		
		
		
		
		
		
	}
	
	
}