package com.algaworks.algatransito.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algatransito.domain.model.Proprietario;
import com.algaworks.algatransito.domain.repository.ProprietarioRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@RestController
public class ProprietarioController {
	
	@Autowired
	private ProprietarioRepository proprietarioRepository;
	
	@GetMapping("/proprietarios")
	public List<Proprietario> listar(){
		
		return proprietarioRepository.findAll();
		
		
	}

}
