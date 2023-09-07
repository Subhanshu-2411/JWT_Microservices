package com.example.jwt_microservices.service;

import com.example.jwt_microservices.model.Home;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class HomeService {
    private final List<Home> homes = new ArrayList<>();

    public HomeService() {
        homes.add(new Home(UUID.randomUUID().toString(), "Subhanshu"));
        homes.add(new Home(UUID.randomUUID().toString(), "Manu"));
        homes.add(new Home(UUID.randomUUID().toString(), "Ananyaa"));
        homes.add(new Home(UUID.randomUUID().toString(), "Tanu"));
        homes.add(new Home(UUID.randomUUID().toString(), "Hello"));
    }

    public List<Home> getHomes() {
        return this.homes;
    }
}
