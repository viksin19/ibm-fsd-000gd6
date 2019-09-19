package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Interface.DoctorInterface;
import com.example.demo.entity.Doctor;

@Controller
@RequestMapping("/")
public class DoctorFeignController {
 @Autowired
 private DoctorInterface doctor;
 
 @RequestMapping("/doctor")
 public String findDoctor(@RequestParam("speciality") String speciality,Model model){
	 
	 model.addAttribute("doctor",doctor.findDoctor(speciality));
	 return "doctorlist";
 }
}
