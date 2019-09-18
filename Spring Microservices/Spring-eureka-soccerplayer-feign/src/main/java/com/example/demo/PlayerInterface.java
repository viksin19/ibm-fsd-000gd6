package com.example.demo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Player;

@FeignClient(name = "player-service",url ="http://localhost:8762/player" )
public interface PlayerInterface {

	@RequestMapping(value = "/players", method = RequestMethod.GET)
	public List<Player> getallplayer();
	
	@RequestMapping(value = "/findplayer", method = RequestMethod.GET)
	public Player findplayer(@RequestParam("id") int id);
	
	@RequestMapping(value = "/addplayer", method = RequestMethod.POST)
	public Player addplayer(@RequestBody Player player);
	
	@RequestMapping(value = "/findbycountry", method = RequestMethod.GET)
	public List<Player> findplayerbycountry(@RequestParam("country") String country);
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public void deleteplayer(@RequestParam("id") int id);
	
	
}
