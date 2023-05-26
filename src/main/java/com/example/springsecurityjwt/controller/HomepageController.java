package com.example.springsecurityjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HomepageController {

    @GetMapping("/user-homepage")
    public String userHomepage() {
        return "Hey, you are in the homepage!" ;
    }
}
