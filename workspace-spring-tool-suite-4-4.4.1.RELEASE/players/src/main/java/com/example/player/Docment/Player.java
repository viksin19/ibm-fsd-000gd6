package com.example.player.Docment;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Player {
     @Id
	private String id;
	private String name;
	private String matches;
	private String runs;
	private String wickets;
	private String highScore;
	public Player() {
		super();
	}
	public Player(String id, String name, String matches, String runs, String wickets, String highScore) {
		super();
		this.id = id;
		this.name = name;
		this.matches = matches;
		this.runs = runs;
		this.wickets = wickets;
		this.highScore = highScore;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMatches() {
		return matches;
	}
	public void setMatches(String matches) {
		this.matches = matches;
	}
	public String getRuns() {
		return runs;
	}
	public void setRuns(String runs) {
		this.runs = runs;
	}
	public String getWickets() {
		return wickets;
	}
	public void setWickets(String wickets) {
		this.wickets = wickets;
	}
	public String getHighScore() {
		return highScore;
	}
	public void setHighScore(String highScore) {
		this.highScore = highScore;
	}
	
	
	
	
}
