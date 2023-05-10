package com.dev.ghizi.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.ghizi.dslist.entitites.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
