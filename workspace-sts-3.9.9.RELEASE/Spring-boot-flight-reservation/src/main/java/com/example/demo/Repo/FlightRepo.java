package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Flight;
@Repository
public interface FlightRepo extends CrudRepository<Flight, Integer> {

}