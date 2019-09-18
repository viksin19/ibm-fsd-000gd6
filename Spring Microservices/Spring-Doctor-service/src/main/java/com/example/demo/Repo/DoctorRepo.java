package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Doctor;
@Repository
public interface DoctorRepo extends CrudRepository<Doctor, Integer> {

	public List<Doctor> findByspeciality(String speciality);
}
