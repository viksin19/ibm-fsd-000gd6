package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.SoccerLeague;

public interface SoccerRepo extends CrudRepository<SoccerLeague, Integer> {

}
