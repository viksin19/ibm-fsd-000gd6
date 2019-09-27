package com.example.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ErrorClass;
import com.example.demo.entity.Project;
import com.example.demo.feignClient.ProjectFeignClient;
import com.example.demo.model.CreateTasksRequestModel;
import com.example.demo.model.CreateTasksResponseModel;
import com.example.demo.repository.ProjectRepository;
import com.example.demo.shared.ProjectDto;
import com.example.demo.shared.TasksDto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	private ProjectRepository projectRepository;
	@Autowired
	private ProjectFeignClient projectFeignClient;
	
	
	@Autowired
	public ProjectServiceImpl(ProjectRepository projectRepository, ProjectFeignClient projectFeignClient) {
		super();
		this.projectRepository = projectRepository;
		this.projectFeignClient = projectFeignClient;
	}

	@Override
	public List<Project> findAll() {

		return (List<Project>) projectRepository.findAll();
	}

	@Override
	public List<Project> findBylocation(String plocation) {
		// TODO Auto-generated method stub
		return projectRepository.findByplocation(plocation);
	}

	@Override
	public Project findById(Long id) {
		// TODO Auto-generated method stub
		return projectRepository.findById(id).get();
	}

	@Override
	public ProjectDto saveProject(ProjectDto projectDto) throws ParseException {
		// TODO Auto-generated method stub
		//projectDto.setStart_date(date.parse(projectDto.getsDate()));
		//projectDto.setEnd_date(date.parse(projectDto.geteDate()));
		
		ModelMapper model = new ModelMapper();
		model.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Project project = model.map(projectDto, Project.class);
		System.out.println(project);
		projectRepository.save(project);
		ProjectDto proDto = model.map(project, ProjectDto.class);
		return proDto;
	}

	@Override
	public void deleteProject(Long id) {
		// TODO Auto-generated method stub
		projectRepository.deleteById(id);
	}

	@Override
	@HystrixCommand(fallbackMethod="getFallbackTask")
	public CreateTasksResponseModel createTask(CreateTasksRequestModel taskDetail) {
		System.out.println(taskDetail.toString());
		ResponseEntity< ?> tDto =  projectFeignClient.createTask(taskDetail);
		ModelMapper model = new ModelMapper();
		model.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		CreateTasksResponseModel tmodel = model.map(tDto.getBody(),CreateTasksResponseModel.class);
		return tmodel;
	}
	
	@Override
	@HystrixCommand(fallbackMethod="getFallbackAllTask")
	public List<?> getAllTasks() {
		List<?> tDto =  projectFeignClient.getAllTasks();
		return tDto;
	}
	
	@Override
	public Project getByEmail(String email) {
		System.out.println(projectRepository.findByPmanagerEmail(email).toString());
		return projectRepository.findByPmanagerEmail(email);
	}
	
	public CreateTasksResponseModel getFallbackTask(CreateTasksRequestModel taskDetail) {
		return new CreateTasksResponseModel("Task Server Down");
	}

	public List<?> getFallbackAllTask() {
		return new ArrayList();
	}

	@Override
	public ProjectDto updateProject(ProjectDto pDto) {
		ModelMapper model = new ModelMapper();
		model.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Project project = model.map(pDto, Project.class);
		Project nProjID = projectRepository.findByPmanagerEmail(project.getPmanagerEmail());
		project.setProjectId(nProjID.getProjectId());
		projectRepository.save(project);
		ProjectDto proDto = model.map(project, ProjectDto.class);
		return proDto;
	}

}
