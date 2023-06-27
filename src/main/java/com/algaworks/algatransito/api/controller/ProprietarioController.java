package com.algaworks.algatransito.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	@GetMapping("/{nome}")
	public List<Proprietario> buscarPeloNome(@PathVariable String nome) {
		return proprietarioRepository.findByNomeContaining(nome);

	}

}
