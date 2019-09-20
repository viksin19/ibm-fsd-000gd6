package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Project;
import com.example.demo.repo.ProjectRepo;

@Service
public class ProjectServiceImpl implements ProjectService {
     @Autowired
	private ProjectRepo projectrepo;
	@Override
	public List<Project> findAll() {
		// TODO Auto-generated method stub
		return (List<Project>) projectrepo.findAll();
	}

	@Override
	public List<Project> findBylocation(String plocation) {
		// TODO Auto-generated method stub
		return projectrepo.findByplocation(plocation);
	}

	@Override
	public Project findById(int id) {
		// TODO Auto-generated method stub
		return projectrepo.findById(id).get();
	}

	@Override
	public Project saveProject(Project project) {
		// TODO Auto-generated method stub
		projectrepo.save(project);
		return project;
	}

	@Override
	public void deleteProject(int id) {
		// TODO Auto-generated method stub
	        projectrepo.deleteById(id);
	}

}
