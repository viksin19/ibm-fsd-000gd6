package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Task;
@Repository
public interface TaskRepo extends CrudRepository<Task, Integer> {

}
