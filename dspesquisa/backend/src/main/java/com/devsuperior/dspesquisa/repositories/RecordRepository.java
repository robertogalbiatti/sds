package com.devsuperior.dspesquisa.repositories;

import java.time.Instant;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspesquisa.entities.Record;
@Repository
public interface RecordRepository extends JpaRepository<Record, Long>{

	@Query("SELECT obj FROM Record obj WHERE "//esse é o padrão para utilizar esse Query
			+ "(coalesce(:min, null) IS NULL or obj.moment >= :min) AND " //garantindo que se for null o mínimo, é verdadeiro o primeiro (), assim como na linha de baixo.
			+ "(coalesce(:max, null) IS NULL or obj.moment <= :max)") //coalesce é uma peculiaridade do PostreSQL
	Page<Record> findByMoments(Instant min, Instant max, Pageable pageable);

}
