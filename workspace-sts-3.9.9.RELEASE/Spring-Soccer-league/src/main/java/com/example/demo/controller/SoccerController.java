package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Repo.SoccerRepo;
import com.example.demo.entity.SoccerLeague;

@Controller
@RequestMapping("/soccer")
public class SoccerController {

	SoccerRepo soccerRepo;
     @Autowired
	public SoccerController(SoccerRepo soccerRepo) {
		super();
		this.soccerRepo = soccerRepo;
	}
	
     @GetMapping("/view")
     public String viewleague(Model model) {
    	 model.addAttribute("leagues", soccerRepo.findAll());
    	 return "viewleague";
     }
     @PostMapping("/save")
     public String saveleague(@ModelAttribute("league") SoccerLeague league) {
    	 soccerRepo.save(league);
    	 return "redirect:/soccer/view";
     }
     @GetMapping("/showform")
     public String add(Model model) {
    	 SoccerLeague league = new SoccerLeague();
    	 model.addAttribute("league", league);
    	 return "form";
     }
     
     @PostMapping("/update")
     public String updateleague(@RequestParam("id") int id ,Model model) {
    	 model.addAttribute("league", soccerRepo.findById(id));
    	 return "form";
     }
     
     @PostMapping("/delete")
  	public String delete(@RequestParam("id") int theId) {
  		soccerRepo.deleteById(theId);
  		return "redirect:/soccer/view";
  		
  	}
	
	
	
}
