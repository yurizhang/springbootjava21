package com.trend.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    // http://localhost:8080/hello2?name=2bbbbbb
    @RequestMapping("/hello")
    public String Hello(String gueString){
        return "Hello World !!" + gueString;

    }
    @RequestMapping("/hello2")
    public String Hello2(String name){
        return "Hello World ?? =" + name;

    }
    
}
