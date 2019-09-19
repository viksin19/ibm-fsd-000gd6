package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Patient;
import com.example.demo.repo.PatientRepo;
@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
	private PatientRepo patientrepo;
	@Override
	public List<Patient> findByDesiese(String desiese) {
		// TODO Auto-generated method stub
		return patientrepo.findBydesiese(desiese);
	}
	@Override
	public Patient savethepatient(Patient patient) {
		// TODO Auto-generated method stub
		patientrepo.save(patient);
		System.out.println(patient.getId());
		return patient;
	}
	@Override
	public Patient findById(int id) {
		// TODO Auto-generated method stub
		return patientrepo.findById(id).get();
	}
    
}
