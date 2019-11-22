package com.example.player.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.player.Docment.Player;
import com.example.player.Repo.PlayerRepo;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
	PlayerRepo player;
    
	@Override
	public void addPlayer(Player pl) {
		// TODO Auto-generated method stub
		player.save(pl);
	}

	@Override
	public List<Player> showPlayer() {
		// TODO Auto-generated method stub
		return (List<Player>)player.findAll();
	}

	@Override
	public void deletePlayer(String id) {
		// TODO Auto-generated method stub
		player.deleteById(id);
	}

	@Override
	public void updatePlayer(Player pl) {
		// TODO Auto-generated method stub
		player.save(pl);
		
	}

}
