package com.example.task.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.task.data.Task;
import com.example.task.data.Teams;
import com.example.task.repository.TasksRepository;
import com.example.task.repository.TeamsRepository;
import com.example.task.shared.TasksDto;
import com.example.task.shared.TeamsDto;


@Service
public class TasksServiceImpl implements TasksService {
	@Autowired
	private Environment env;
	private TasksRepository tasksRepository;
	private TeamsRepository teamsRepository;

	@Autowired
	public TasksServiceImpl(Environment env, TasksRepository tasksRepository, TeamsRepository teamsRepository) {
		super();
		this.env = env;
		this.tasksRepository = tasksRepository;
		this.teamsRepository = teamsRepository;
	}

	@Override
	public TasksDto createNewTask(TasksDto taskDetail) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		Task tasksEntity = mapper.map(taskDetail, Task.class);
		tasksRepository.save(tasksEntity);
		TasksDto uDto = mapper.map(tasksEntity, TasksDto.class);
		return uDto;
	}
	
	
	@Override
	public TeamsDto createNewTeam(TeamsDto teamDetail) {
		Optional<Task> otask = tasksRepository.findById(teamDetail.getTaskid());
		Task task  = otask.get();
		System.out.println("Task"+task.toString());
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Teams teamEntity = mapper.map(teamDetail, Teams.class);
		teamEntity.setTasks(task);
		teamsRepository.save(teamEntity);
		TeamsDto uDto = mapper.map(teamEntity, TeamsDto.class);
		return uDto;
	}

	@Override
	public TasksDto getTask(String taskname) {
		Task taskEntity = tasksRepository.findByTaskname(taskname);
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		TasksDto tDto = mapper.map(taskEntity, TasksDto.class);
		return tDto;
	}

}
