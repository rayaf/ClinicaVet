package com.example.demo.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Especie;

@RestController
@RequestMapping("/especies/{id}")
public class EspecieResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Especie> listar(){
		Especie cat1 = new Especie(1, "cavalo");
		Especie cat2 = new Especie(2, "cachorro");
		Especie cat3 = new Especie(3, "Sei que não é");
		
		List<Especie> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		lista.add(cat3);
		
		return lista;

	}
}
