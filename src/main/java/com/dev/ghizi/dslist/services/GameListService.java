package com.dev.ghizi.dslist.services;

import com.dev.ghizi.dslist.dto.GameListDTO;
import com.dev.ghizi.dslist.entitites.GameList;
import com.dev.ghizi.dslist.projections.GameMinProjection;
import com.dev.ghizi.dslist.repositories.GameListRepository;
import com.dev.ghizi.dslist.repositories.GameRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameListDTO> dto = gameListRepository.findAll().stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }

    @Transactional
    public void move(long listId, int sourceIndex, int destinationIndex) {
        List<GameMinProjection> lista = gameRepository.searchByList(listId);
        GameMinProjection obj = lista.remove(sourceIndex);
        lista.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
        
        for (int i = min; i <= max; i++) {
            gameListRepository.updateBelongingPosition(listId, lista.get(i).getId(), i);
        }
    }
    
    
}
