package com.dev.ghizi.dslist.dto;

import com.dev.ghizi.dslist.entitites.Game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class GameMinDTO {
    private Long id;
    private String title;
    private String year;
    private String imgUrl;
    private String ShortDescription;


    public GameMinDTO(Game entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.ShortDescription = entity.getShortDescription();
    }

}
