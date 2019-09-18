package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Player;
import com.example.demo.entity.SoccerLeague;

@Controller
@RequestMapping("/")
public class SoccerfeignController {
	@Autowired
	private SoccerInterface soccer;
	@RequestMapping("/list")
	public String fetchsoccer(Model model) {
		
		List<SoccerLeague> league = soccer.getall();
		model.addAttribute("league",league);
		return "soccerhome";
	}
	
	
	@PostMapping("/fetchbyyear")
	public String fetchbyyear(@RequestParam("year") int year,Model model) {
		model.addAttribute("league",soccer.findByYear(year) );
		return "soccerhome";
	}
	
	@GetMapping("/soccerform")
	public String showform(Model model) {
		 SoccerLeague league = new SoccerLeague();
		model.addAttribute("league",league);
		return "soccerform";
	}
	
	@PostMapping("/saveleague")
	public String saveleague(@ModelAttribute("league") SoccerLeague league) {
		
		soccer.addLeague(league);
		
		return "redirect:/list";
	}
	
	@PostMapping("/soccerdelete")
	public String deleteleague(@RequestParam("id") int id){
		
		soccer.deleteleague(id);
		
		return "redirect:/list";
		
	}
	
	@PostMapping("/update")
	public String upform(@RequestParam("id") int id,Model model) {
		model.addAttribute("league",soccer.findByid(id));
		return "soccerform";
	}
	
}
