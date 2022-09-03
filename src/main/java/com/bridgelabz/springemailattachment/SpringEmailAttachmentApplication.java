package com.bridgelabz.springemailattachment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication
public class SpringEmailAttachmentApplication {

    @Autowired
    private EmailSenderService emailSenderService;

    public static void main(String[] args) {
        SpringApplication.run(SpringEmailAttachmentApplication.class, args);
    }
    @EventListener(ApplicationReadyEvent.class)
    public  void triggerEmail() throws MessagingException {
        emailSenderService.sendMailWithAttachment("roshni.mali@bridgelabz.com","Body:Arun Resume","Subject:This is Email with atachment(ARUN RESUME)","C:\\Users\\rarnk\\OneDrive\\Desktop\\RESUME.pdf");
    }

}
