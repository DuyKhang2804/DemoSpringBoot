package com.cybersoft.demospringboot.controller;

import com.cybersoft.demospringboot.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorPageController {

    @Autowired
    UserModel userModel;

    @GetMapping("")
    public String index(){
        System.out.println("Calculator: " + userModel.getName() + "-" + userModel.getAge());
        return "";
    }

    @GetMapping("/plus")
    public int Plus(@RequestParam("a") int a,
                    @RequestParam("b") int b){
        return  a+b;
    }

}
