package com.example.demo.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class SendMailService {
    @Autowired
	private JavaMailSender mailsender;

	public SendMailService(JavaMailSender mailsender) {
		super();
		this.mailsender = mailsender;
	}
    
    public void sendMail(String to, String subject,String body) throws MessagingException {
    	
    	MimeMessage mail = mailsender.createMimeMessage();
    	MimeMessageHelper helper = new MimeMessageHelper(mail,true);
    	
    	helper.setTo(to);
    	helper.setSubject(subject);
    	helper.setFrom("ibmtectraining007@gmail.com");
    	mail.setContent(body,"text/html");
    	
    	mailsender.send(mail);
    }
}
