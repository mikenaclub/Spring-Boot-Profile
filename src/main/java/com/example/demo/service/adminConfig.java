package com.example.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by mike on 28/6/2560.
 */
@Service
@Profile({"admin","default"})
public class adminConfig implements mainConfig{

    @Override
    public String profileName(){
        return "Admin";
    }
}
