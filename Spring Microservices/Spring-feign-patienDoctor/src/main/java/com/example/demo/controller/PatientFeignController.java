package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Interface.DoctorInterface;
import com.example.demo.Interface.PatientInterface;
import com.example.demo.entity.Patient;

@Controller
@RequestMapping("/")
public class PatientFeignController {
	
	@Autowired
	private PatientInterface patient;
	@Autowired private DoctorInterface doctor;
	private static int id;
	
	@RequestMapping("/fetchbydesiese")
	public String fetchpatient(@RequestParam("desiese") String desiese, Model model){
		model.addAttribute("patient",patient.findPatient(desiese));
		return "patientlist";
	}
      @PostMapping("/savepatient")
      public String savePatient(@ModelAttribute("patient") Patient pobj,Model model) {
    	 Patient rp= patient.savepatient(pobj);
    	 id=rp.getId();
    	  model.addAttribute("doctor",doctor.findDoctor(pobj.getDesiese()));
    	   
    	  return "book-list";
      }
      @GetMapping("/showform")
      public String showpatientform(Model model) {
    	  Patient pobj = new Patient();
    	   model.addAttribute("patient", pobj);
    	  return "patientform";
      }
      
      public static int getSessionid() {
    	  return id;
      }
}
