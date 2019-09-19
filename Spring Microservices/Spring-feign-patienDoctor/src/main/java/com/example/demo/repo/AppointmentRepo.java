package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Appointment;
@Repository
public interface AppointmentRepo extends CrudRepository<Appointment, Integer> {

}
