package com.cybersoft.demospringboot.controller;

//Anotation => @

import com.cybersoft.demospringboot.model.AccountModel;
import com.cybersoft.demospringboot.model.UserModel;
import com.cybersoft.demospringboot.service.AccountService;
import com.cybersoft.demospringboot.service.EmailService;
import com.cybersoft.demospringboot.service.FacebookService;
import com.cybersoft.demospringboot.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController ( kết hợp @Controller và @RestBody ) : 1 link chỉ trả về text (json) ko trả về UI
// @Controller  : trả về content (html)
// @RestBody : khai báo controller chỉ trả ra text
// @RequestMapping : định nghĩa đg dẫn api

@RestController
@RequestMapping ("/home")
public class HomePageController {
    @Autowired
    UserModel userModel;


    @Autowired
    AccountService accountService;

    @GetMapping("")
//    public Object index(){
//        UserModel userModel = new UserModel();
//                userModel.setName("Khang");
//                userModel.setAge("20");
//        return userModel;
//    }
    public String index(){

        MessageService fbMessageService = new FacebookService();
        MessageService emailMessageService = new EmailService();
//
//
        ContactController contactController = new ContactController(fbMessageService);
        contactController.send();

        HomeController homeController = new HomeController(emailMessageService);
        homeController.send();
//        AccountModel accountModel1 = new AccountModel();
//        accountModel1.setId(1);
//        accountModel1.setOwnerName("A");
//        accountModel1.setBalance(50000);
//
//        AccountModel accountModel2 = new AccountModel();
//        accountModel2.setId(2);
//        accountModel2.setOwnerName("B");
//        accountModel2.setBalance(150000);
//
//        accountService.insert(accountModel1);
//        accountService.insert(accountModel2);
//        System.out.println(accountService.getAll().size());
//        userModel.setName("Tran thi Tham");
//        System.out.println(userModel.getName())
//        return accountService.getAll();
        return "";
    }

    @GetMapping("/detail")
    public String detail(){
        return "Hello Detail Page";
    }
}

//Tạo 1 đường dẫn calculator
//calculator/plus => sẽ trả ra kết quả tính tổng của 2 tham số nhận vào
