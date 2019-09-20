package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Project;

public interface ProjectService {
   
	public List<Project> findAll();
	public List<Project> findBylocation(String plocation);
	public Project findById(int id);
	public Project saveProject(Project project);
	public void deleteProject(int id);
	
}
