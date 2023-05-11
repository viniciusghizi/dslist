package com.dev.ghizi.dslist.dto;

import com.dev.ghizi.dslist.entitites.GameList;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class GameListDTO {
    private Long id;
    private String name;

    public  GameListDTO(GameList entity){
        this.id = entity.getId();
        this.name = entity.getName();
    }
}

