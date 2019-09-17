package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Player;
import com.example.demo.repo.PlayeRepo;
@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
	private PlayeRepo playerrepo;
	@Override
	public List<Player> getallplayers() {
		// TODO Auto-generated method stub
		return (List<Player>) playerrepo.findAll();
	}

	@Override
	public Player findbyid(int id) {
		// TODO Auto-generated method stub
		return playerrepo.findById(id).get();
	}

	@Override
	public List<Player> findbycountry(String country) {
		// TODO Auto-generated method stub
		return playerrepo.findBycountry(country);
	}

	@Override
	public void addPlayer(Player player) {
		// TODO Auto-generated method stub
            playerrepo.save(player);
	}

	@Override
	public void updatePlayer(Player player) {
		// TODO Auto-generated method stub
         playerrepo.save(player);
	}

	@Override
	public void deletePlayer(int id) {
		// TODO Auto-generated method stub
		playerrepo.deleteById(id);;

	}

}
