package com.dev.ghizi.dslist.services;

import com.dev.ghizi.dslist.dto.GameListDTO;
import com.dev.ghizi.dslist.entitites.GameList;
import com.dev.ghizi.dslist.repositories.GameListRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameListDTO> dto = gameListRepository.findAll().stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }
    
    
}
