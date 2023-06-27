package com.algaworks.algatransito.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algatransito.domain.model.Proprietario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@RestController
public class ProprietarioController {
	
	@PersistenceContext
	private EntityManager manager;
	
	@GetMapping("/proprietarios")
	public List<Proprietario> listar(){
		
		return manager.createQuery("from Proprietario", Proprietario.class).getResultList();
		
	}

}
