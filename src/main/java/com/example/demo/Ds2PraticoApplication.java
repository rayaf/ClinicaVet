package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Animal;
import com.example.demo.domain.Especie;
import com.example.demo.domain.enums.TipoSexo;
import com.example.demo.repositores.AnimalRepository;
import com.example.demo.repositores.EspecieRepository;

@SpringBootApplication
public class Ds2PraticoApplication implements CommandLineRunner {
	@Autowired
	EspecieRepository especieRepository;
	
	@Autowired
	AnimalRepository animalRepository;

	public static void main(String[] args) {
		SpringApplication.run(Ds2PraticoApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception{
		Especie especie1 = new Especie(null, "Felino");
		Especie especie2 = new Especie(null, "Canis");
		this.especieRepository.saveAll(Arrays.asList(especie1, especie2));
		
		Animal animal_1a = new Animal(null, "felix", 3, TipoSexo.MACHO, especie1);
		Animal animal_2a = new Animal(null, "Tico", 2, TipoSexo.FEMEA, especie1);
		Animal animal_1b = new Animal(null, "Cicarelle", 5, TipoSexo.FEMEA, especie2);
		Animal animal_2b = new Animal(null, "Junior", 3, TipoSexo.MACHO, especie2);
		this.animalRepository.saveAll(Arrays.asList(animal_1a, animal_1b, animal_2a, animal_2b));

	}

}
