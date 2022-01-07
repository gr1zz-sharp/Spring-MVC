package com.example.thymeleafapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class DiceController {

    @GetMapping("/dice")
    public String dice(Model model){
        model.addAttribute("roller", new Random().nextInt(20) + 1);
        model.addAttribute("activePage", "dice");
        return "dice";
    }
}
