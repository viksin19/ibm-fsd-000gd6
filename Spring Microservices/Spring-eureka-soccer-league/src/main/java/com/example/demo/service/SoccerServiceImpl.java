package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.SoccerLeague;
import com.example.demo.repo.SoccerLeagueRepo;
@Service
public class SoccerServiceImpl implements SoccerService {
     @Autowired
	 SoccerLeagueRepo soccerRepo;
	@Override
	public List<SoccerLeague> getall() {
		// TODO Auto-generated method stub
		return (List<SoccerLeague>) soccerRepo.findAll();
	}

	@Override
	public SoccerLeague findbyid(int id) {
		// TODO Auto-generated method stub
		return soccerRepo.findById(id).get();
	}

	@Override
	public void addLeague(SoccerLeague league) {
		// TODO Auto-generated method stub
		soccerRepo.save(league);

	}

	@Override
	public List<SoccerLeague> findbyYear(int year) {
		// TODO Auto-generated method stub
		return soccerRepo.findByyear(year);
	}

	@Override
	public void deleteleague(int id) {
		// TODO Auto-generated method stub
		soccerRepo.deleteById(id);
		
	}

}
