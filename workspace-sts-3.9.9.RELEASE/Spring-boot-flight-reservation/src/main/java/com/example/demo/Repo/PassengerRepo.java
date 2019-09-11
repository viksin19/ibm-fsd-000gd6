package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Passenger;
@Repository
public interface PassengerRepo extends CrudRepository<Passenger, Integer> {

}
