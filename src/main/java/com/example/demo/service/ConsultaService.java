package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Consulta;
import com.example.demo.repositores.ConsultaRepository;

@Service
public class ConsultaService {
	
	@Autowired
	ConsultaRepository repositorio;
	
	public Consulta buscar(Integer id) {
		Optional<Consulta> obj = repositorio.findById(id);
		
		return obj.orElse(null);

	}

}
