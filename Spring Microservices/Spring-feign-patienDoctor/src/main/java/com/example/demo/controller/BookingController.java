package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Interface.DoctorInterface;
import com.example.demo.Interface.PatientInterface;
import com.example.demo.entity.Appointment;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.repo.AppointmentRepo;

@Controller
@RequestMapping("/")
public class BookingController {
     @Autowired
	private AppointmentRepo appointment;
     @Autowired
    private DoctorInterface doctor;
    @Autowired
    private PatientInterface patient;
    
    private static int id=0;
     
     @PostMapping("/bookdoctor")
     public String bookDoctor(@RequestParam("id")int id,Model model ) {
    	 Doctor dobj = doctor.findbyid(id);
    	 Patient pobj = patient.findbyid(PatientFeignController.getSessionid());
    	 id++;
    	 Appointment app = new Appointment(id,pobj.getName(),dobj.getName(),pobj.getDesiese());
    	 appointment.save(app);
    	 model.addAttribute("appintment", app);
    	 return "apointment";
     }
     
     @GetMapping("/apointmentlist")
     public String allAppointment(Model model) {
    	 model.addAttribute("appointment", appointment.findAll());
    	 return "appointment";
     }
}
