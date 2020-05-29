package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Especie;
import com.example.demo.repositores.EspecieRepository;

@Service
public class EspecieService {
	
	@Autowired
	private EspecieRepository repositorio;
	
	public Especie buscar(Integer id) {
		Optional<Especie> obj = repositorio.findById(id);
		
		return obj.orElse(null);
	}

}
