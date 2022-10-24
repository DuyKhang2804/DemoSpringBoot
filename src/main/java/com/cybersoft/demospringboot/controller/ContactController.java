package com.cybersoft.demospringboot.controller;

import com.cybersoft.demospringboot.service.EmailService;
import com.cybersoft.demospringboot.service.MessageService;

public class ContactController {

    MessageService messageService = null;

    public ContactController(MessageService messageService){
        this.messageService = messageService;
    }

    public void send(){
        messageService.sendMessage();
    }

}
