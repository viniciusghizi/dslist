package com.dev.ghizi.dslist.services;

import com.dev.ghizi.dslist.dto.GameMinDTO;
import com.dev.ghizi.dslist.entitites.Game;
import com.dev.ghizi.dslist.repositories.GameRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<GameMinDTO> dto = gameRepository.findAll().stream().map( x -> new GameMinDTO(x)).toList();
        return dto;
    }
    
}
