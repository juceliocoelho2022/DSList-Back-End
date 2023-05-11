package com.desenvolvedor.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desenvolvedor.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
  
	
	
}
