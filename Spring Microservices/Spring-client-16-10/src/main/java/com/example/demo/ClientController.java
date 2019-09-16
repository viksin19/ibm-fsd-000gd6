package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ClientController {
	@Autowired
	private Environment env;
	@Value("${luckyword}")
	private String word;
	private static final Logger logger = LoggerFactory.getLogger(ClientController.class);
	
	@RequestMapping("/lucky-word")
	public String getword() {
		logger.info("config read from server.. running clitn at port no: "+env.getProperty("local.server.port"));
		return "your lucky word is: "+word;
	}
	

}
