package com.microservice.eureka.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/sayHello")
public class HelloController {

    @GetMapping
    public String sayHello(){return "Hello";}
}
