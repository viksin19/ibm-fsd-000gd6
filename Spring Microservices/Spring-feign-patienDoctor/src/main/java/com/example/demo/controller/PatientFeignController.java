package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Interface.PatientInterface;
import com.example.demo.entity.Patient;

@RestController
@RequestMapping("/")
public class PatientFeignController {
	
	@Autowired
	private PatientInterface patient;
	
	@RequestMapping("/fetchbydesiese")
	public ResponseEntity<List<Patient>> fetchpatient(@RequestParam("desiese") String desiese){
		
		return ResponseEntity.ok(patient.findPatient(desiese));
	}

}
