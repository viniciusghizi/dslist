package com.dev.ghizi.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.ghizi.dslist.dto.GameMinDTO;
import com.dev.ghizi.dslist.services.GameService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(value ="/games")
public class GameController {

    @Autowired
    private  GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        log.info("GET on /games");
        return gameService.findAll();
    }
    
}
