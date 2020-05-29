package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Especie;
import com.example.demo.repositores.EspecieRepository;

@SpringBootApplication
public class Ds2PraticoApplication implements CommandLineRunner {
	@Autowired
	EspecieRepository especieRepository;

	public static void main(String[] args) {
		SpringApplication.run(Ds2PraticoApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception{
		Especie especie1 = new Especie(null, "Felino");
		Especie especie2 = new Especie(null, "Canis");
		
		this.especieRepository.saveAll(Arrays.asList(especie1, especie2));
	}

}
