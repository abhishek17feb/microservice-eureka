package com.microservice.eureka.eureka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@RequestMapping("/sayHello")
public class HelloController {

    @GetMapping
    public String sayHello(){return "Hello";}
}
