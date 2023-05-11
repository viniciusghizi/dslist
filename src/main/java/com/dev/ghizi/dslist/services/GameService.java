package com.dev.ghizi.dslist.services;

import com.dev.ghizi.dslist.dto.GameDTO;
import com.dev.ghizi.dslist.dto.GameMinDTO;
import com.dev.ghizi.dslist.entitites.Game;
import com.dev.ghizi.dslist.projections.GameMinProjection;
import com.dev.ghizi.dslist.repositories.GameRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> dto = gameRepository.findAll().stream().map( x -> new GameMinDTO(x)).toList();
        return dto;
    }
    
    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        GameDTO dto = new GameDTO(gameRepository.findById(id).get());
        return dto;
    }
    
    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinDTO> dto = gameRepository.searchByList(listId).stream().map( x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
