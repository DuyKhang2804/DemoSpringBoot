package com.cybersoft.demospringboot.service.HasInterface;

public class EmailService implements ServiceInterface {
    @Override
    public void send() {
        System.out.println("Email Here");
    }
}
