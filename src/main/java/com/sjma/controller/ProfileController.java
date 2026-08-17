package com.sjma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/create")
public class ProfileController {

    @GetMapping("/profile")
    private String profilePage(){
        return "candidates/profile";
    }
}
