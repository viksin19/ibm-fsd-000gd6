package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.DoctorRepo;
import com.example.demo.entity.Doctor;
@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepo doctor;
	@Override
	public List<Doctor> findBySpeciality(String speciality) {
		// TODO Auto-generated method stub
		return (List<Doctor>) doctor.findByspeciality(speciality);
	}

}
