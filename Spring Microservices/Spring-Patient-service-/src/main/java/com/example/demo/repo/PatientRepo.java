package com.example.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Patient;
@Repository
public interface PatientRepo extends CrudRepository<Patient, Integer> {
	
	public List<Patient> findBydesiese(String desiese);

}
