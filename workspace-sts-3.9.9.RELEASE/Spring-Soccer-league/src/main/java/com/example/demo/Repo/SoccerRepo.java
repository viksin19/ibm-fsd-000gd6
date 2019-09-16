package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.SoccerLeague;
@Repository
public interface SoccerRepo extends CrudRepository<SoccerLeague, Integer> {

}
