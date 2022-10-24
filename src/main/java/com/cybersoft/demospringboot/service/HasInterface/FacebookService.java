package com.cybersoft.demospringboot.service.HasInterface;

public class FacebookService implements ServiceInterface {

    @Override
    public void send() {
        System.out.println("Facebook here");
    }
}
