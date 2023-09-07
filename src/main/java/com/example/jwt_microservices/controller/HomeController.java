package com.example.jwt_microservices.controller;

import com.example.jwt_microservices.model.Home;
import com.example.jwt_microservices.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/home")
    public List<Home> getHomes() {
        System.out.println("Getting Homes");
        return homeService.getHomes();
    }
}
