package com.example.demo.bootstrap;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Project;
import com.example.demo.entity.Tasks;
import com.example.demo.entity.User;
import com.example.demo.repository.ProjectRepository;
import com.example.demo.repository.TaskRepository;
import com.example.demo.repository.UserRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
	
	ProjectRepository projectRepository;
	TaskRepository taskRepository;
	UserRepository userRepository;

	public DevBootstrap(ProjectRepository projectRepository, TaskRepository taskRepository,
			UserRepository userRepository) {
		super();
		this.projectRepository = projectRepository;
		this.taskRepository = taskRepository;
		this.userRepository = userRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		try {
			init();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void init() throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");	
		Project proj = new Project(1,1,1,"Seeru","Seeru veedu","vetri","06-10-2019","05-10-2020");
		proj.setStart_date(date.parse(proj.getsDate()));
        proj.setEnd_date(date.parse(proj.geteDate()));
        Project project = new Project(proj.getPid(),proj.getUid(),proj.getTid(),proj.getPname(),proj.getPlocation(),proj.getStart_date(),proj.getEnd_date(),proj.getPmanager());
		User user = new User("sp","mumbai","true","qwertyuiop","www.img.com","fsd","xyz","abc");
		Tasks task = new Tasks("abc","sp","31-10-2019","21-02-2021","true");
		project.getTasks().add(task);
		project.getUser().add(user);
		projectRepository.save(project);
		userRepository.save(user);
        taskRepository.save(task);        
        System.out.println("Bye");
	}

}
