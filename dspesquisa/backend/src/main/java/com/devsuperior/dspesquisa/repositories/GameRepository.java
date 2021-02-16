package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspesquisa.entities.Game;

@Repository //registrando a inejeção de dependência...
public interface GameRepository extends JpaRepository<Game, Long>{

}
