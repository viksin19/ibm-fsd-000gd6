package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.service.PatientService;

@RestController
@RequestMapping("/")
public class PatientController {
	@Autowired
	private PatientService service;
	
	@GetMapping("/findbydesiese")
	public ResponseEntity<List<Patient>> findpatient(@RequestParam("desiese") String desiese){
		
		return ResponseEntity.ok(service.findByDesiese(desiese));
	}
	
	@PostMapping("/savepatient")
	public Patient savePatient(@RequestBody Patient patient) {
		
		return service.savethepatient(patient);
	}
	@GetMapping("/findbyid")
	public ResponseEntity<Patient> findById(@RequestParam("id") int id){
		
		return ResponseEntity.ok(service.findById(id));
	}

}
