package com.com.smartCoading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailSandingApplication {
	@Autowired
	private EmailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(EmailSandingApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() {
		senderService.sendEmail("momd07865@gmail.com", "i have done email sending done using spring boot", "this is body of email");
	}
}
