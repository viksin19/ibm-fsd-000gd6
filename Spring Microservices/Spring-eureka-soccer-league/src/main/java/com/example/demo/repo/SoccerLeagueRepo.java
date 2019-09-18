package com.example.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.SoccerLeague;
@Repository
public interface SoccerLeagueRepo extends CrudRepository<SoccerLeague, Integer> {

	

	List<SoccerLeague> findByyear(int year);

}
