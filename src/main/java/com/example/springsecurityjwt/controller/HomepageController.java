package com.example.springsecurityjwt.controller;

import com.example.springsecurityjwt.service.TokenService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class HomepageController {

    @GetMapping("/user-homepage")
    public String userHomepage() {
        return "Hey, you are in the homepage!";
    }

    private final TokenService tokenService;
    @PostMapping("/getToken")
    public String getToken(Authentication authentication){
        return tokenService.generateToken(authentication);
    }
}
