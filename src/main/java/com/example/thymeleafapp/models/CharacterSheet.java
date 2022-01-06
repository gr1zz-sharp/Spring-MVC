package com.example.thymeleafapp.models;

import javax.persistence.*;

@Entity
@Table(name="CharacterSheet")
public class CharacterSheet {

    //
    //Data Members
    //

    @Id
    @GeneratedValue
    private int characterSheetId;
    @OneToOne(cascade = CascadeType.ALL, targetEntity = Player.class)
    @JoinColumn(name = "player_id", referencedColumnName = "playerId")
    private Player player;
    private String name;
    private String characterClass;
    private String race;
    private int age;

    //
    // Constructors
    //

    public CharacterSheet(){

    }

    public CharacterSheet(int characterSheetId, Player player, String name, String characterClass, String race, int age) {
        this.characterSheetId = characterSheetId;
        this.player = player;
        this.name = name;
        this.characterClass = characterClass;
        this.race = race;
        this.age = age;
    }


    //
    // Accessors
    //


    public int getCharacterSheetId() {
        return characterSheetId;
    }

    public Player getPlayer() {
        return player;
    }

    public String getName() {
        return name;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public String getRace() {
        return race;
    }

    public int getAge() {
        return age;
    }

    public void setCharacterSheetId(int characterSheetId) {
        this.characterSheetId = characterSheetId;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
