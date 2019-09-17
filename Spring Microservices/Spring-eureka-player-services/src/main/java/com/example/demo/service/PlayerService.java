package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Player;

public interface PlayerService {
  
	public List<Player> getallplayers();
	public Player findbyid(int id);
	public List<Player> findbycountry(String country);
	public void addPlayer(Player player);
	public void updatePlayer(Player player);
	public void deletePlayer(int id);
}
