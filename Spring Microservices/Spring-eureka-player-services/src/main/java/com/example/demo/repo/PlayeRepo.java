package com.example.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Player;
@Repository
public interface PlayeRepo extends CrudRepository<Player, Integer> {

	List<Player> findBycountry(String country);

}
