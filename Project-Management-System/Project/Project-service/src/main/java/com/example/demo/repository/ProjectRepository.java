package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Project;
@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

	List<Project> findByplocation(String plocation);
	List<Project> findByPmanagerEmail(String email);
}
