package com.example.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Especie;
import com.example.demo.service.EspecieService;

@RestController
@RequestMapping("/especies/{id}")
public class EspecieResource {
	
	@Autowired
	EspecieService service;
	
	@RequestMapping(value ="/{id}", method = RequestMethod.GET)
	public ResponseEntity<Especie> find(@PathVariable Integer id){
		Especie obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
