package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Model.Gallery;


@RestController
@RequestMapping("/")
public class GalleryController {
	@Autowired
	RestTemplate resttemplate;
	
	@RequestMapping("/")
	public String status() {
		return "okk";
	}
	@SuppressWarnings("unchecked")
	@RequestMapping("/{id}")
	public Gallery getgallery(@PathVariable int id) {
		
		Gallery gallery= new Gallery();
		gallery.setId(1);
		
		List<Object> list= resttemplate.getForObject("http://myimage/images", List.class);
		
		gallery.setImages(list);
		return gallery;
	}

}
