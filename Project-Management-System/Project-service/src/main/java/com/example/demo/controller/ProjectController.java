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

import com.example.demo.entity.Project;
import com.example.demo.service.ProjectService;

@Controller
@RestController
@RequestMapping("/")
public class ProjectController {
     @Autowired
     private	ProjectService service;
     
     @RequestMapping("/getallproject")
     public ResponseEntity<List<Project>> getAllproject(){
    	 
    	 return ResponseEntity.ok(service.findAll()); 
     }
     
    @GetMapping("/findbyid")
    public ResponseEntity<Project> findById(@RequestParam("id") int id){
    	
    	return ResponseEntity.ok(service.findById(id));
    }
    
    @GetMapping("/findbyloction")
    public ResponseEntity<List<Project>> projectbyLoction(@RequestParam("plocation") String plocation){
    	
    	return ResponseEntity.ok(service.findBylocation(plocation));
    }
    
    @PostMapping("/saveproject")
    public ResponseEntity<Project> saveProject(@RequestBody Project project){
    	
    	return ResponseEntity.ok(service.saveProject(project));
    }
    
    @PostMapping("/deleteproject")
    public ResponseEntity<?> deleteProject(@RequestParam("id")int id){
    	service.deleteProject(id);
    	return ResponseEntity.ok("deleted");
    }
}
