package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mike on 28/6/2560.
 */
@Controller
public class mapping {

    @RequestMapping("/")
    public String home(){
        return "home";
    }
}
