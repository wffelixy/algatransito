package com.algaworks.algatransito.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.algatransito.domain.model.Proprietario;

@Repository
public interface ProprietarioRepository extends JpaRepository<Proprietario, Long> {

}
