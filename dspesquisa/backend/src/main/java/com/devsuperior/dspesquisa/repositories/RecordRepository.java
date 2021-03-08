package com.devsuperior.dspesquisa.repositories;

import java.time.Instant;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspesquisa.entities.Record;
@Repository
public interface RecordRepository extends JpaRepository<Record, Long>{

	@Query("SELECT obj FROM Record obj") //esse é o padrão para utilizar esse Query
	Page<Record> findByMoments(Instant min, Instant max, PageRequest pageRequest);

}
