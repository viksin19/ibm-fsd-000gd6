package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Patient;
import com.example.demo.repo.PatientRepo;
@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
	private PatientRepo patient;
	@Override
	public List<Patient> findByDesiese(String desiese) {
		// TODO Auto-generated method stub
		return patient.findBydesiese(desiese);
	}

}
