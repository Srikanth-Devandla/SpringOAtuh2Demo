package com.sri.springoatuh2demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api") // if you want to uncomment this please add this url(http://localhost:9090/api/login/oauth2/code/github) in github or google
public class SampleController {

    //create get method endpoint
    @GetMapping("/")
    public String greetMessage(){
        return "Hello, Welcome to SpringSecurity OAuth2 Course..!";
    }
}
