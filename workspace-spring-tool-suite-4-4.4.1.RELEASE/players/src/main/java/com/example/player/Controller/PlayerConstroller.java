package com.example.player.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.player.Docment.Player;
import com.example.player.Service.PlayerService;

@RestController
@RequestMapping("/player")
public class PlayerConstroller {
     @Autowired
	PlayerService service;
     
     @PostMapping("/add")
     public ResponseEntity<?> addPlayer(@RequestBody Player pl){
    	 service.addPlayer(pl);
    	 return ResponseEntity.ok("Created");
     }
     
     @GetMapping("/show")
     public ResponseEntity<List<Player>> showPlayer(){
    	 
    	 return ResponseEntity.ok(service.showPlayer());
     }
     @PostMapping("/update")
     public ResponseEntity<?> updatePlayer(@RequestBody Player pl){
    	 service.updatePlayer(pl);
    	 return ResponseEntity.ok("Updated");
     }
     @GetMapping("/delete")
     public ResponseEntity<?> deletePlayer(@RequestParam String id){
    	 
    	 service.deletePlayer(id);
    	 return ResponseEntity.ok("Deleted");
     }
     
}
