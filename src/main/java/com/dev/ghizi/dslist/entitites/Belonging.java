package com.dev.ghizi.dslist.entitites;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table( name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private Integer position;


public Belonging(Game game, GameList gameList, Integer position) {
    id.setGame(game);
    id.setGameList(gameList);
    this.position = position;
}

}
