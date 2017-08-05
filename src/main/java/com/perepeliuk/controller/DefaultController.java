package com.perepeliuk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("/")
    public String users() {
        return "/users";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

}