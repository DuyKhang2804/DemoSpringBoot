package com.cybersoft.demospringboot.service.NoInterface;

public class ContractController {
    EmailService emailService = null;
    public ContractController(){
        emailService = new EmailService();
    }
    public void send(){
        emailService.sendMessage();
    }
}
