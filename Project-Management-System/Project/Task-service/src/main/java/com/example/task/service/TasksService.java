package com.example.task.service;

import java.util.List;

import com.example.task.data.Tasks;
import com.example.task.shared.TasksDto;

public interface TasksService {
	
	public TasksDto createNewTask(TasksDto taskDetail);
	public TasksDto getTask(String taskName);
	public List<Tasks> getAllTasks();
}
