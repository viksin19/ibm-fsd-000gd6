package com.example.task.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.task.data.ErrorClass;
import com.example.task.data.Tasks;
import com.example.task.model.CreateTasksRequestModel;
import com.example.task.model.CreateTasksResponseModel;
import com.example.task.model.CreateTeamsRequestModel;
import com.example.task.service.TasksService;
import com.example.task.shared.TasksDto;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TasksController {
	@Autowired
	private TasksService tasksService;


	@PostMapping("/tasks")
	public ResponseEntity<?> createTask(@RequestBody CreateTasksRequestModel taskDetail) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		TasksDto tDto = mapper.map(taskDetail, TasksDto.class);

		TasksDto tempDto = tasksService.createNewTask(tDto);
		CreateTasksResponseModel model = mapper.map(tempDto, CreateTasksResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(model);

	}
	
	@PostMapping("/updateTask")
	public ResponseEntity<?> updateTask(@RequestBody ArrayList<CreateTasksRequestModel> task) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		CreateTasksRequestModel taskDetail = task.get(0);
		TasksDto tDto = mapper.map(taskDetail, TasksDto.class);
		tasksService.updateTask(tDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(new ErrorClass("Updated"));

	}
	
	@GetMapping("/taskById/{taskId}")
	public ResponseEntity<CreateTasksResponseModel> getTaskByName(@PathVariable Long taskId) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		TasksDto tempDto = tasksService.getTask(taskId);

		CreateTasksResponseModel model = mapper.map(tempDto, CreateTasksResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(model);
	}
	
	@GetMapping("/deleteTask/{id}")
	public ResponseEntity<?> deleteTask(@PathVariable("id") Long id) {
		tasksService.deleteTask(id);
		return ResponseEntity.ok("deleted");
	}
	
	@GetMapping("/getAllTasks/{projectId}")
	public ResponseEntity<?> getAllTasks(@PathVariable Long projectId) {
		List<Tasks> tmodel = tasksService.getAllTasks(projectId);
		return ResponseEntity.status(HttpStatus.CREATED).body(tmodel);
	}

	@PostMapping("/tasks/team")
	public ResponseEntity<?> createTeam(@RequestBody ArrayList<CreateTeamsRequestModel> team) {
		System.out.println(team.toString());
		CreateTeamsRequestModel teamDetail = team.get(0);
		boolean tmodel =tasksService.createTeam(teamDetail);
		return ResponseEntity.status(HttpStatus.CREATED).body(tmodel);
	}

	@GetMapping("/tasks/teams/{id}")
	public ResponseEntity<?> getAllTeams(@PathVariable Long taskId) {
		List<?> tmodel = tasksService.getAllTeam(taskId);
		return ResponseEntity.status(HttpStatus.CREATED).body(tmodel);
	}
	
	@GetMapping("/tasks/team/{email}")
	public ResponseEntity<?> deleteTeamMember(@PathVariable String email) {
		boolean tmodel = tasksService.deleteTeamMember(email);
		return ResponseEntity.status(HttpStatus.CREATED).body(tmodel);
	}
}
