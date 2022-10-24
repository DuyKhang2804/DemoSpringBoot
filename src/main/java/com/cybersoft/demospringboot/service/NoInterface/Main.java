package com.cybersoft.demospringboot.service.NoInterface;

public class Main {
    public static void main(String[] arg){
        FacebookService facebookService = new FacebookService();
        facebookService.sendMessage();

        EmailService emailService = new EmailService();
        emailService.sendMessage();
    }
}
