package com.cybersoft.demospringboot.controller;

import com.cybersoft.demospringboot.service.MessageService;

public class HomeController {
    MessageService messageService = null;

    public HomeController(MessageService messageService){
        this.messageService = messageService;
    }

    public void send(){
        messageService.sendMessage();
    }
}
