package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mike on 28/6/2560.
 */
import com.example.demo.service.mainConfig;
@RestController
public class checkProfile {

    @Autowired
    private mainConfig profile;

    @PostMapping("/api/checkProfile")
    public String profilemessage(){
        System.setProperty("spring.profiles.active", "user");
        System.out.println(profile.profileName());
        return profile.profileName();
    }
}
