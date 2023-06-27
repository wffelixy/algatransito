package com.algaworks.algatransito.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algatransito.domain.model.Proprietario;
import com.algaworks.algatransito.domain.repository.ProprietarioRepository;

@RestController
@RequestMapping("/proprietarios")
public class ProprietarioController {

	@Autowired
	private ProprietarioRepository proprietarioRepository;

	@GetMapping
	public List<Proprietario> listar() {
		return proprietarioRepository.findAll();
	}

	@GetMapping("/nome/{nome}")
	public List<Proprietario> buscarPeloNome(@PathVariable String nome) {
		return proprietarioRepository.findByNomeContaining(nome);

	}

	@GetMapping("/{proprietarioId}")
	public ResponseEntity<Proprietario> buscar(@PathVariable Long proprietarioId) {
		

		//Recurso via lambda
		return proprietarioRepository.findById(proprietarioId)
				.map(proprietario -> ResponseEntity.ok(proprietario))
				.orElse(ResponseEntity.notFound().build());
		
		//TODO Recurso sem usar Lambda
		//		if (proprietario.isPresent()) {
//			return ResponseEntity.ok(proprietario.get());
//		}
//		
//		return ResponseEntity.notFound().build();
	}

}
