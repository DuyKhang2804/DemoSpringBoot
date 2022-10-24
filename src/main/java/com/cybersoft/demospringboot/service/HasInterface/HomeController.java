package com.cybersoft.demospringboot.service.HasInterface;

public class HomeController {
    ServiceInterface serviceInterface = null;
    public HomeController(ServiceInterface serviceInterface){
        this.serviceInterface = serviceInterface;
    }

    public void sendMessage(){
        serviceInterface.send();
    }
}
