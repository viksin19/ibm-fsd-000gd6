package com.example.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Project;
@Repository
public interface ProjectRepo extends CrudRepository<Project, Integer> {

	List<Project> findByplocation(String plocation);
}
