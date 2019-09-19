package com.example.demo.Interface;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Patient;

@FeignClient(name = "patient-service", url = "http://localhost:8762/patient")
public interface PatientInterface {

	@RequestMapping(value = "/findbydesiese", method = RequestMethod.GET)
	public List<Patient> findPatient(@RequestParam("desiese") String desiese);
    @RequestMapping(value = "/savepatient", method = RequestMethod.POST)
	public Patient savepatient(Patient pobj);
    @RequestMapping(value = "/findbyid", method = RequestMethod.GET)
	public Patient findbyid(@RequestParam("id") int sessionid);

}
