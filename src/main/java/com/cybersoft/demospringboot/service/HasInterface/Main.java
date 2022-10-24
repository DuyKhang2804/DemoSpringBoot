package com.cybersoft.demospringboot.service.HasInterface;

public class Main {
    public static void main(String[] args){
        ServiceInterface facebookService = new FacebookService();
        ContactController contactController = new ContactController(facebookService);
        contactController.sendMessage();

        ServiceInterface eMailService = new EmailService();
        HomeController homeController = new HomeController(eMailService);
        homeController.sendMessage();
    }
}
