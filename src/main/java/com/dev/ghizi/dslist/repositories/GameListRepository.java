package com.dev.ghizi.dslist.repositories;



import org.springframework.data.jpa.repository.JpaRepository;


import com.dev.ghizi.dslist.entitites.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

    
}
