package com.example.demo.controller;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Image;


@RestController

public class ImageController {
	@Autowired
	private Environment env;
	
	@RequestMapping("/images")
	public List<Image> getimages(){
		
		List<Image> list=Arrays.asList(new Image(1,"image1","imageurl1"),
				new Image(2,"image2","imageurl2"),
				new Image(3,"image3","imageurl3"));              
		return list;
	}

}
