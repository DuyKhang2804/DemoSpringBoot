package com.cybersoft.demospringboot.service.NoInterface;

import com.cybersoft.demospringboot.service.HasInterface.ServiceInterface;

public class HomeController {
    ServiceInterface serviceInterface = null;
    public HomeController(ServiceInterface serviceInterface){
        this.serviceInterface = serviceInterface;
    }

    public void sendMessage(){
        serviceInterface.send();
    }
}
