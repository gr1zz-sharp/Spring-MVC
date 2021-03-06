package com.example.thymeleafapp.repository;

import com.example.thymeleafapp.models.CharacterSheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterSheet, Integer> {
}
