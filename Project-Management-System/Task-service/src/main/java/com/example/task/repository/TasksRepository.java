package com.example.task.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.task.data.Task;

@Repository
public interface TasksRepository extends JpaRepository<Task, Integer> {
	Task findByTaskname(String taskname);
}
