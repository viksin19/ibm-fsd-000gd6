package com.example.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Project;
import com.example.demo.repository.ProjectRepository;
import com.example.demo.shared.ProjectDto;

@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectRepository projectRepository;
	SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");

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
	public Project findById(int id) {
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
		projectRepository.save(project);
		ProjectDto proDto = model.map(project, ProjectDto.class);
		return proDto;
	}

	@Override
	public void deleteProject(int id) {
		// TODO Auto-generated method stub
		projectRepository.deleteById(id);
	}

}
