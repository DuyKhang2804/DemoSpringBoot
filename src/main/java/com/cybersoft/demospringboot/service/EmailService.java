package com.cybersoft.demospringboot.service;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(){
        System.out.println("Email sending");
    }
}
