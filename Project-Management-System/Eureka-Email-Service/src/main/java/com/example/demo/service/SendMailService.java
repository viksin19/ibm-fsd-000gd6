package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendMailService {
    @Autowired
	private JavaMailSender mailsender;

	public SendMailService(JavaMailSender mailsender) {
		super();
		this.mailsender = mailsender;
	}
    
    public void sendMail(String to, String subject,String body) {
    	
    	SimpleMailMessage mail = new SimpleMailMessage();
    	
    	mail.setTo(to);
    	mail.setSubject(subject);
    	mail.setText(body);
    	mail.setFrom("ibmtectraining007@gmail.com");
    	
    	mailsender.send(mail);
    }
}
