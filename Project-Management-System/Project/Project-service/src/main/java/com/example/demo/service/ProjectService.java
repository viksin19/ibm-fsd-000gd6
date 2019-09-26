package com.example.demo.service;

import java.text.ParseException;
import java.util.List;

import com.example.demo.entity.Project;
import com.example.demo.model.CreateTasksRequestModel;
import com.example.demo.model.CreateTasksResponseModel;
import com.example.demo.shared.ProjectDto;
import com.example.demo.shared.TasksDto;

public interface ProjectService {
   
	public List<Project> findAll();
	public List<Project> findBylocation(String plocation);
	public Project findById(Long id);
	public ProjectDto saveProject(ProjectDto project) throws ParseException;
	public void deleteProject(Long id);
	public CreateTasksResponseModel createTask(CreateTasksRequestModel taskDetail);
	public List<Project> getByEmail(String email);
	
}
