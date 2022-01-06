package com.example.thymeleafapp.controllers;

import com.example.thymeleafapp.models.CharacterSheet;
import com.example.thymeleafapp.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @GetMapping("/characterSheet")
    public String createCharacter(Model model){
        CharacterSheet characterSheet = new CharacterSheet();
        model.addAttribute("characterSheet", characterSheet);
        model.addAttribute("activePage", "create");
        return "character_creation";
    }

    @PostMapping("/characterSheet")
    public String characterCreated(@ModelAttribute("character_creation")CharacterSheet characterSheet){
        System.out.println(characterSheet.getName());
        characterService.addCharacter(characterSheet);
        return "character_created";
    }
}
