package com.hbd_notification.util;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor

public class EmailSender {
    private final JavaMailSender javaMailSender;

    public void sendMail(String to, String message) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(to);
//            mailMessage.setSubject();
        mailMessage.setText(message);
        javaMailSender.send(mailMessage);
    }


}
