package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Animal {
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

	public Animal(Integer id, String nome, Integer idade, Integer sex, Especie especie) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.sex = sex;
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

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
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
