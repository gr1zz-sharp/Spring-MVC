package com.example.thymeleafapp.controllers;

import com.example.thymeleafapp.models.Player;
import com.example.thymeleafapp.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PlayerController {

    @Autowired
    private CharacterService characterService;

    @GetMapping("/player")
    public String addPlayer(Model model){
        Player player = new Player();
        model.addAttribute("player", player);
        model.addAttribute("activePage", "player");
        return "player";
    }

    @PostMapping("/player")
    public String playerAdded(@ModelAttribute("player")Player player, Model model){
        System.out.println(player.getFirstName());
        characterService.addPlayer(player);
        model.addAttribute("newPlayerName", player.getFirstName());
        return "player_added";
    }
}
