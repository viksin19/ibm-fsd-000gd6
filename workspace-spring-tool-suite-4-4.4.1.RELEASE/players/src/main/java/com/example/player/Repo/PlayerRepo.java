package com.example.player.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.player.Docment.Player;

public interface PlayerRepo extends MongoRepository<Player, String> {

}
