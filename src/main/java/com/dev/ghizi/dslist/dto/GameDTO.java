package com.dev.ghizi.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.dev.ghizi.dslist.entitites.Game;

import lombok.Data;

@Data
public class GameDTO {

    private Long id;
    private String title;
    private String year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String ShortDescription;
    private String longDescription;

    public GameDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);

    }
}
