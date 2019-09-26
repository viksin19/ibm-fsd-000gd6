package com.example.demo.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ErrorClass;
import com.example.demo.entity.Project;
import com.example.demo.feignClient.ProjectFeignClient;
import com.example.demo.model.CreateProjectRequestModel;
import com.example.demo.model.CreateProjectResponseModel;
import com.example.demo.model.CreateTasksRequestModel;
import com.example.demo.model.CreateTasksResponseModel;
import com.example.demo.service.ProjectService;
import com.example.demo.shared.ProjectDto;
import com.example.demo.shared.TasksDto;

@RestController
public class ProjectController {
	@Autowired
	private ProjectService service;

	@RequestMapping("/projects/getallproject")
	public ResponseEntity<List<Project>> getAllproject() {

		return ResponseEntity.ok(service.findAll());
	}

	@GetMapping("/findbyid")
	public ResponseEntity<Project> findById(@RequestParam("id") Long id) {

		return ResponseEntity.ok(service.findById(id));
	}

	@GetMapping("/findbyemail/{email}")
	public ResponseEntity<?> findByEmail(@PathVariable("email") String email) {

		return ResponseEntity.ok(service.getByEmail(email));
	}

	@GetMapping("/findbyloction")
	public ResponseEntity<List<Project>> projectbyLoction(@RequestParam("plocation") String plocation) {

		return ResponseEntity.ok(service.findBylocation(plocation));
	}

	@PostMapping("/projects")
	public ResponseEntity<CreateProjectResponseModel> create(@RequestBody ArrayList<CreateProjectRequestModel> pData)
			throws ParseException {
		// TODO Auto-generated method stub
		ModelMapper model = new ModelMapper();
		model.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		System.out.println(pData.get(0).toString());
		CreateProjectRequestModel projectreq = pData.get(0);
		ProjectDto pDto = model.map(projectreq, ProjectDto.class);
		ProjectDto tempDto = service.saveProject(pDto);
		CreateProjectResponseModel proRes = model.map(tempDto, CreateProjectResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(proRes);
	}

	@PostMapping("/deleteproject")
	public ResponseEntity<?> deleteProject(@RequestParam("id") Long id) {
		service.deleteProject(id);
		return ResponseEntity.ok("deleted");
	}

	@PostMapping("/projects/tasks")
	public ResponseEntity<?> createTeam(@RequestBody CreateTasksRequestModel taskDetail) {
		CreateTasksResponseModel tmodel = service.createTask(taskDetail);
		
		if(tmodel.getTaskName().equals("Task Server Down"))
			return ResponseEntity.status(HttpStatus.CREATED).body(new ErrorClass("Task Server Down"));
		return ResponseEntity.status(HttpStatus.CREATED).body(tmodel);
	}
}
