package com.example.thymeleafapp.service;

import com.example.thymeleafapp.models.CharacterSheet;
import com.example.thymeleafapp.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    public void addCharacter(CharacterSheet characterSheet){
        characterRepository.save(characterSheet);
    }
}
