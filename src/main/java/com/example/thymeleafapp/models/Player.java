package com.example.thymeleafapp.models;

import javax.persistence.*;

@Entity
@Table(name="Player")
public class Player {

    //
    //Data Members
    //

    @Id
    @GeneratedValue
    private int playerId;
    private String firstName;
    private String lastName;

    //
    //Constructors
    //

    public Player(){

    }

    public Player(int playerId, String firstName, String lastName) {
        this.playerId = playerId;
        this.firstName = firstName;
        this.lastName = lastName;
    }



    //
    //Accessors
    //

    public int getPlayerId() {
        return playerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //
    //Override
    //


}
