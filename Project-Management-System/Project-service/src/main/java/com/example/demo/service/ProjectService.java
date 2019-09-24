package com.example.demo.service;

import java.text.ParseException;
import java.util.List;

import com.example.demo.entity.Project;
import com.example.demo.shared.ProjectDto;

public interface ProjectService {
   
	public List<Project> findAll();
	public List<Project> findBylocation(String plocation);
	public Project findById(int id);
	public ProjectDto saveProject(ProjectDto project) throws ParseException;
	public void deleteProject(int id);
	public ProjectDto updateProject(ProjectDto project, int id) throws ParseException;
	
}
