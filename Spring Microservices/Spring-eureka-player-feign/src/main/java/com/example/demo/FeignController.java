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

@Controller
@RequestMapping("/")
public class FeignController {
	@Autowired
	private PlayerInterface playerservice;
	
	@RequestMapping("/fetchplayer")
	public String fetchplayer(Model model) {
		
		List<Player> player = playerservice.getallplayer();
		model.addAttribute("player",player);
		return "home";
	}
	
	@PostMapping("/fetchbyid")
	public String fetchbyid(@RequestParam("id") int id, Model model) {
		
		model.addAttribute("player", playerservice.findplayer(id));
		return "home";
	}
	
	@PostMapping("/fetchbycountry")
	public String fetchbycountry(@RequestParam("country") String country,Model model) {
		model.addAttribute("player", playerservice.findplayerbycountry(country));
		return "home";
	}
	
	@GetMapping("/showform")
	public String showform(Model model) {
		Player player = new Player();
		model.addAttribute("player",player);
		return "showform";
	}
	
	@PostMapping("/saveplayer")
	public String saveplayer(@ModelAttribute("player") Player player) {
		System.out.println("playersobject"+player.getLname());
		playerservice.addplayer(player);
		
		return "redirect:/fetchplayer";
	}
	
	@PostMapping("/delete")
	public String deleteplayer(@RequestParam("id") int id){
		
		playerservice.deleteplayer(id);
		
		return "redirect:/fetchplayer";
		
	}
	
	@PostMapping("/updateform")
	public String upform(@RequestParam("id") int id,Model model) {
		model.addAttribute("player", playerservice.findplayer(id));
		return "showform";
	}
	

}
