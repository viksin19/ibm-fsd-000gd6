package com.example.demo.controller;

import java.text.ParseException;
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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Project;
import com.example.demo.feignClient.ProjectFeignClient;
import com.example.demo.model.CreateProjectRequestModel;
import com.example.demo.model.CreateProjectResponseModel;
import com.example.demo.model.CreateTasksRequestModel;
import com.example.demo.service.ProjectService;
import com.example.demo.shared.ProjectDto;

@RestController
public class ProjectController {
	@Autowired
	private ProjectService service;
	@Autowired
	private ProjectFeignClient projectFeignClient;

	@RequestMapping("/getallproject")
	public ResponseEntity<List<Project>> getAllproject() {

		return ResponseEntity.ok(service.findAll());
	}

	@GetMapping("/findbyid")
	public ResponseEntity<Project> findById(@RequestParam("id") long id) {

		return ResponseEntity.ok(service.findById(id));
	}

	@GetMapping("/findbyloction")
	public ResponseEntity<List<Project>> projectbyLoction(@RequestParam("plocation") String plocation) {

		return ResponseEntity.ok(service.findBylocation(plocation));
	}

	@PostMapping("/projects")
	public ResponseEntity<CreateProjectResponseModel> create(@RequestBody CreateProjectRequestModel projectreq)
			throws ParseException {
		// TODO Auto-generated method stub
		ModelMapper model = new ModelMapper();
		model.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		ProjectDto pDto = model.map(projectreq, ProjectDto.class);
		ProjectDto tempDto = service.saveProject(pDto);
		CreateProjectResponseModel proRes = model.map(tempDto, CreateProjectResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(proRes);
	}

	@GetMapping("/deleteproject")
	public ResponseEntity<?> deleteproject(@RequestParam("id") long id) {
		service.deleteProject(id);
		return ResponseEntity.ok("deleted");
	}
	@PostMapping("/project/{id}")
    public ResponseEntity<CreateProjectResponseModel> updateProject(@PathVariable("id") int id, @RequestBody CreateProjectRequestModel update) throws ParseException{
    	ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		ProjectDto dto = mapper.map(update, ProjectDto.class);
		ProjectDto dto1 = service.updateProject(dto, id);
		CreateProjectResponseModel user = mapper.map(dto1, CreateProjectResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
	
	@PostMapping("/projects/tasks")
	public ResponseEntity<?> createTeam(@RequestBody CreateTasksRequestModel taskDetail) {

		return ResponseEntity.status(HttpStatus.CREATED).body(projectFeignClient.createTask(taskDetail));
	}
}
