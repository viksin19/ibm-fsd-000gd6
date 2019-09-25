package com.example.demo.service;

import java.text.ParseException;
import java.util.List;

import com.example.demo.entity.Project;
import com.example.demo.shared.ProjectDto;

public interface ProjectService {
   
	public List<Project> findAll();
	public List<Project> findBylocation(String plocation);
	public Project findById(long id);
	public ProjectDto saveProject(ProjectDto project) throws ParseException;
	public void deleteProject(long id);
	ProjectDto updateProject(ProjectDto project, long id) throws ParseException;
	
}
