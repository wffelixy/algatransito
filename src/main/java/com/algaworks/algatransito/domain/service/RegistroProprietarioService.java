package com.algaworks.algatransito.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algatransito.domain.model.Proprietario;
import com.algaworks.algatransito.domain.repository.ProprietarioRepository;

@Service
public class RegistroProprietarioService {
	
	@Autowired
	private ProprietarioRepository proprietarioRepository;	
	
	@Transactional
	public Proprietario salvar(Proprietario proprietario) {
		return proprietarioRepository.save(proprietario);
	}
	
	@Transactional
	public void ecluir(Long proprietarioId) {
		proprietarioRepository.deleteById(proprietarioId);
	}

}
