package com.example.demo.Interface;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Doctor;

@FeignClient(name = "doctor-service", url = "http://localhost:8762/doctor")
public interface DoctorInterface {

	@RequestMapping(value = "/findbyspeciality", method = RequestMethod.GET)
	public List<Doctor> findDoctor(@RequestParam("speciality") String speciality);
    @RequestMapping(value = "/findbyid", method = RequestMethod.GET)
	public Doctor findbyid(@RequestParam("id") int id);
}
