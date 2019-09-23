package com.example.demo.bootstrap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Project;
import com.example.demo.entity.Task;
import com.example.demo.entity.User;
import com.example.demo.repo.ProjectRepo;
import com.example.demo.repo.TaskRepository;
import com.fasterxml.jackson.databind.Module.SetupContext;

public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
	
	ProjectRepo projectRepo;
	TaskRepository taskRepository;

	public DevBootstrap(ProjectRepo projectRepo, TaskRepository taskRepository) {
		super();
		this.projectRepo = projectRepo;
		this.taskRepository = taskRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("welcome....");
		try {
			init();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void init() throws ParseException {
		// TODO Auto-generated method stub
		List<Task> list = new ArrayList<Task>();
		List<User> list1 = new ArrayList<User>();
		SimpleDateFormat objSDF = new SimpleDateFormat("dd-MM-yyyy");		
		Project project = new Project("abc","kolkata","20-08-2019","23-08-2020","sp");		
		project.setStart_date(objSDF.parse(project.getStartDate()));
		project.setEnd_date(objSDF.parse(project.getEndDate()));
		Task task = new Task("sp","soor","31/10/2019","31/12/2020","true");
		list.add(task);
		User user = new User("renu", "delhi", "true", "sraji@gmail.com", "www.img.com", "fsd", "abc");
		list1.add(user);
		project.setUsers(list1);
		project.setTask(list);
		project.setPid(UUID.randomUUID().toString());
		System.out.println(project.getEnd_date());
		Project pro = new Project(project.getPid(),project.getPname(),project.getPlocation(),project.getStart_date(),project.getEnd_date(),project.getPmanager(),list1,list);
		System.out.println(pro.toString());
		System.out.println(task.toString());
		projectRepo.save(pro);
		taskRepository.save(task);
		
	}

}
