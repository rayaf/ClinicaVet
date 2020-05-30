package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.demo.domain.enums.TipoSexo;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Animal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	private Integer idade;
	private Integer sex;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "especie_id")
	private Especie especie;
	
	public Animal() {
		
	}

	public Animal(Integer id, String nome, Integer idade, TipoSexo sex, Especie especie) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.sex = sex.getCod();
		this.especie = especie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public TipoSexo getTipoSexo() {
		return TipoSexo.toEnum(sex);
	}

	public void setTipoSexo(TipoSexo sex) {
		this.sex = sex.getCod();
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public Integer getId() {
		return id;
	}
	
	
	
}
