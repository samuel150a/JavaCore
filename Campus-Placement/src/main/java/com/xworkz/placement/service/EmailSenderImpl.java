package com.xworkz.placement.service;

import com.xworkz.placement.config.EmailConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
public class EmailSenderImpl implements EmailSender {

    @Autowired
    EmailConfiguration configuration;


    @Override
    public void mailSender(String email, String otp) {
        System.out.println("Invoking mailSend ");
        SimpleMailMessage simpleMailMessage= new SimpleMailMessage();
        simpleMailMessage.setTo(email);
        simpleMailMessage.setSubject("Otp to login");
        simpleMailMessage.setText("Otp for login "+otp);
        configuration.mailSender().send(simpleMailMessage);
        System.out.println("Otp sent for :"+email+" : "+otp);
    }


}