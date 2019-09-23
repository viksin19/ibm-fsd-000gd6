package com.example.demo.controller;

import java.text.ParseException;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Project;
import com.example.demo.model.CreateProjectRequestModel;
import com.example.demo.model.CreateProjectResponseModel;
import com.example.demo.service.ProjectService;
import com.example.demo.shared.ProjectDto;

@Controller
@RestController
@RequestMapping("/")
public class ProjectController {
     @Autowired
     private ProjectService service;
     
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
    public ResponseEntity<CreateProjectResponseModel> create(@RequestBody CreateProjectRequestModel projectreq) throws ParseException {
		// TODO Auto-generated method stub
		ModelMapper model = new ModelMapper();
		model.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		ProjectDto pDto = model.map(projectreq, ProjectDto.class);		
		ProjectDto tempDto = service.saveProject(pDto);		
		CreateProjectResponseModel proRes = model.map(tempDto, CreateProjectResponseModel.class);		
    	return ResponseEntity.status(HttpStatus.CREATED).body(proRes);
    }
    
    @PostMapping("/deleteproject")
    public ResponseEntity<?> deleteProject(@RequestParam("id") int id){
    	service.deleteProject(id);
    	return ResponseEntity.ok("deleted");
    }
}
