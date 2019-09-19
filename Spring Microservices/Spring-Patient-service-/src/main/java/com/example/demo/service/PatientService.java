package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Patient;

public interface PatientService {

	public List<Patient> findByDesiese(String desiese);

	public Patient savethepatient(Patient patient);

	public Patient findById(int id);
}
