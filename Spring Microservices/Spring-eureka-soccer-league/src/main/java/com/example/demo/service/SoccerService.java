package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.SoccerLeague;

public interface SoccerService {

	public List<SoccerLeague> getall();
	public SoccerLeague findbyid(int id);
	public void addLeague(SoccerLeague league);
	public List<SoccerLeague> findbyYear(int year);
	public void deleteleague(int id);
}
