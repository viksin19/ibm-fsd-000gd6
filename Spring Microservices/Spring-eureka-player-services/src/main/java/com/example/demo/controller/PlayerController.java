package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Player;
import com.example.demo.service.PlayerService;

@RestController
@RequestMapping("/")
public class PlayerController {
	@Autowired
	private PlayerService playerservice;
	
	@GetMapping("/players")
	public ResponseEntity<List<Player>> getallplayers(){
		
		return ResponseEntity.ok(playerservice.getallplayers());
	}
	
	@GetMapping("/findplayer")
	public ResponseEntity<Player> findplayer(@RequestParam("id") int id) {
		
		return ResponseEntity.ok(playerservice.findbyid(id));
	}
	
	@PostMapping("/addplayer")
	public void addplayer(@RequestBody Player player) {
		System.out.println(player.getFname());
		playerservice.addPlayer(player); 
	}
	
	@GetMapping("/findbycountry")
	public ResponseEntity<List<Player>> findplayerbycountry(@RequestParam("country") String country) {
		
		return ResponseEntity.ok(playerservice.findbycountry(country));
	}
	
	@PostMapping("/delete")
	public void deleteplayer(@RequestParam("id") int id){
		
		playerservice.deletePlayer(id);
	}
}
