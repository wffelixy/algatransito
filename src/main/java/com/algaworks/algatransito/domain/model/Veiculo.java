package com.algaworks.algatransito.domain.model;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Veiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "proprietario_id")
	private Proprietario proprietario;
	
	@Column
	private String marca;
	@Column
	private String modelo;
	@Column
	private String placa;
	
	@Enumerated(EnumType.STRING)
	
	private StatusVeiculo status;
	private LocalDateTime dataCadastro;
	private LocalDateTime dataApreensao;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public StatusVeiculo getStatus() {
		return status;
	}
	public void setStatus(StatusVeiculo status) {
		this.status = status;
	}
	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public LocalDateTime getDataApreensao() {
		return dataApreensao;
	}
	public void setDataApreensao(LocalDateTime dataApreensao) {
		this.dataApreensao = dataApreensao;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
