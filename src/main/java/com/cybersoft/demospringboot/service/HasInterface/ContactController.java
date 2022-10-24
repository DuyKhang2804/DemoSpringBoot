package com.cybersoft.demospringboot.service.HasInterface;

public class ContactController {
    ServiceInterface serviceInterface = null;
    public ContactController(ServiceInterface serviceInterface){
        this.serviceInterface = serviceInterface;
    }

    public void sendMessage(){
        serviceInterface.send();
    }
}
