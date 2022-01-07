package com.example.thymeleafapp.controllers;

import com.example.thymeleafapp.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private CharacterService characterService;

    @GetMapping("/home")
    public String home(){
        return "home";
    }
}
