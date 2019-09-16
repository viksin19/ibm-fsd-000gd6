package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.SoccerLeague;
import com.example.demo.repo.SoccerRepo;

@Controller
@RequestMapping("/soccer")
public class SoocerController {
SoccerRepo soccerRepo;
@Autowired
public SoocerController(SoccerRepo soccerRepo) {
	super();
	this.soccerRepo = soccerRepo;
}

@GetMapping("/view")
public String viewLeague(Model model) {
	model.addAttribute("league", soccerRepo.findAll());
	return "view_league";
}
@GetMapping("/addform")
public String addform(Model model) {
	SoccerLeague league = new SoccerLeague();
	model.addAttribute("league", league);
	return "showform";
}
@PostMapping("/saveleague")
public String saveSoccer(@ModelAttribute("league") SoccerLeague league,Model model) {
	
	soccerRepo.save(league);
	model.addAttribute("league", soccerRepo.findAll());
	return "view_league";
}
	
}
