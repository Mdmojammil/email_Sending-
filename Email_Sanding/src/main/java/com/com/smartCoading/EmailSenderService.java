package com.com.smartCoading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
	@Autowired
	public JavaMailSender mailSender;
	
	public void sendEmail(String toEmail,
			String subject,
			String body) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("momd07865@gmail.com");
		message.setTo(toEmail);
		message.setText(subject);
		
		mailSender.send(message);
		System.out.println("mail sent successfuly...");
	}
}
