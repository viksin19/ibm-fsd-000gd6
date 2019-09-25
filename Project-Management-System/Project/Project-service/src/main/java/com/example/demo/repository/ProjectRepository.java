package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Project;
@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

	List<Project> findByplocation(String plocation);
	Optional<Project> findByprojectId(Long id);
	void deleteByprojectId(Long id);
}
