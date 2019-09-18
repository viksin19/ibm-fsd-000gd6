package com.example.demo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Player;
import com.example.demo.entity.SoccerLeague;

@FeignClient(name = "soccer-service",url = "http://localhost:8762/soccer")
public interface SoccerInterface {

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<SoccerLeague> getall();
	
	@RequestMapping(value = "/findbyid", method = RequestMethod.GET)
	public SoccerLeague findByid(@RequestParam("id") int id);
	
	@RequestMapping(value = "/addleague", method = RequestMethod.POST)
	public SoccerLeague addLeague(@RequestBody SoccerLeague league);
	
	@RequestMapping(value = "/findbyyear", method = RequestMethod.POST)
	public List<Player> findByYear(@RequestParam("year") int year);
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public void deleteleague(@RequestParam("id") int id);
}
