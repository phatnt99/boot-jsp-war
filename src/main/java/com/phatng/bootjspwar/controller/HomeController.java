package com.phatng.bootjspwar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/home")
public class HomeController {
    @RequestMapping
    public String home() {
        return "home";
    }
}
