package com.devsuperior.dspesquisa.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dspesquisa.dto.RecordInsertDTO;

@RestController
@RequestMapping(value ="/records")
public class RecordResource {

	@Autowired
	private RecordService service;
	
	@PostMapping
	public ResponseEntity <RecordInsertDTO> findAll(){ //terá nome, idade e o código do game
		
	}
}
