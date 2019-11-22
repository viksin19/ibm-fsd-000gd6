package com.example.player.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.player.Entity.Player;
import com.example.player.Service.PlayerService;

@RestController
@RequestMapping("/player")
public class PlayerController {
	@Autowired
	private PlayerService service;
	
	@PostMapping("/add")
	public ResponseEntity<String> addPlayer(@RequestBody Player pl){
		System.out.println(pl);
		service.addPlayer(pl);
		System.out.println("Added");
		return ResponseEntity.ok("Created");
	}
	
	@GetMapping("/show")
	public ResponseEntity<?> allPlayer(){
	Player players = service.showPlayer();
	System.out.println(players);
		System.out.println("LOL !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1");
		return ResponseEntity.ok(players);
	}

}
