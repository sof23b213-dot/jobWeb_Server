package com.uovt.jobweb_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController{
    @GetMapping
    public  String hello(){
        return "Hello World";
    }

}
