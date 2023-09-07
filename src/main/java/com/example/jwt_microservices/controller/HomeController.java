package com.example.jwt_microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/user")
    public String getUser() {
        System.out.println("Getting Users");
        return "Users";
    }
}
