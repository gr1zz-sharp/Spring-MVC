package com.example.thymeleafapp.service;

import com.example.thymeleafapp.models.CharacterSheet;
import com.example.thymeleafapp.models.Player;
import com.example.thymeleafapp.repository.CharacterRepository;
import com.example.thymeleafapp.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    @Autowired
    private PlayerRepository playerRepository;

    public void addCharacter(CharacterSheet characterSheet){
        characterRepository.save(characterSheet);
    }

    public void addPlayer(Player player){playerRepository.save(player);}

}
