package com.example.player.Service;

import java.util.List;

import com.example.player.Docment.Player;

public interface PlayerService {

	public void addPlayer(Player pl);
	public List<Player> showPlayer();
	public void deletePlayer(String id);
	public void updatePlayer(Player pl);
}
