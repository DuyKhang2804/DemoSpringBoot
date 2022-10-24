package com.cybersoft.demospringboot.service;

public class FacebookService implements MessageService {
    @Override
    public void sendMessage(){
        System.out.println("Facebook sending");
    }
}
