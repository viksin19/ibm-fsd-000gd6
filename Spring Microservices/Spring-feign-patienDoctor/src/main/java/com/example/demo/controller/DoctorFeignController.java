package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Interface.DoctorInterface;
import com.example.demo.entity.Doctor;

@RestController
@RequestMapping("/")
public class DoctorFeignController {
 @Autowired
 private DoctorInterface doctor;
 
 @RequestMapping("/doctor")
 public ResponseEntity<List<Doctor>> findDoctor(@RequestParam("speciality") String speciality){
	 
	 return ResponseEntity.ok(doctor.findDoctor(speciality));
 }
}
