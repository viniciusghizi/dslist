package com.dev.ghizi.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.ghizi.dslist.dto.GameListDTO;
import com.dev.ghizi.dslist.dto.GameMinDTO;
import com.dev.ghizi.dslist.dto.ReplacementDTO;
import com.dev.ghizi.dslist.services.GameListService;
import com.dev.ghizi.dslist.services.GameService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(value ="/lists")
public class GameListController {

    @Autowired
    private  GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        log.info("GET on /lists");
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable long listId) {
        log.info("GET on /lists/{}", listId);
        return gameService.findByList(listId);
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable long listId, @RequestBody ReplacementDTO body) {
        log.info("POST on /lists/{}/games with this info: {}", listId, body);
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }    
}
