package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@RestController
@RequestMapping("/")
public class DoctorController {
	
	@Autowired
	private DoctorService service;
	
	@GetMapping("/findbyspeciality")
	public ResponseEntity<List<Doctor>> findbySpeciality(@RequestParam("speciality") String speciality){
		
		return ResponseEntity.ok(service.findBySpeciality(speciality));
	}
 
}
