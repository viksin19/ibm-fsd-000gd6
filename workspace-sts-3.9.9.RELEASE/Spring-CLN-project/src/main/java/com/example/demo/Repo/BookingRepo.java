package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Booking;
@Repository
public interface BookingRepo extends CrudRepository<Booking, Integer> {

}
