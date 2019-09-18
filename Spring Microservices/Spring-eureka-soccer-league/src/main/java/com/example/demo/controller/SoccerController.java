package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.SoccerLeague;
import com.example.demo.service.SoccerService;

@RestController
@RequestMapping("/")
public class SoccerController {
    @Autowired
	SoccerService service;
    
    @GetMapping("/list")
    public ResponseEntity<List<SoccerLeague>> getall(){
    	
    	return ResponseEntity.ok(service.getall());
    }
    @PostMapping("/addleague")
    public void addLeague(@RequestBody SoccerLeague league) {
    	
    	service.addLeague(league);
    }
    @GetMapping("/findbyid")
    public ResponseEntity<SoccerLeague> findByid(@RequestParam("id") int id){
    	
    	return ResponseEntity.ok(service.findbyid(id));
    }
    @PostMapping("/delete")
    public void deleteleague(@RequestParam("id") int id) {
    	service.deleteleague(id);
    }
    
    @PostMapping("/findbyyear")
    public ResponseEntity<List<SoccerLeague>> findByYear(@RequestParam("year") int year ){
    	return ResponseEntity.ok(service.findbyYear(year));
    }
	
	
}
