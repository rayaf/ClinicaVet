package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Animal;
import com.example.demo.domain.Cliente;
import com.example.demo.domain.Consulta;
import com.example.demo.domain.Especie;
import com.example.demo.domain.Veterinario;
import com.example.demo.domain.enums.TipoSexo;
import com.example.demo.repositores.AnimalRepository;
import com.example.demo.repositores.ClienteRepository;
import com.example.demo.repositores.ConsultaRepository;
import com.example.demo.repositores.EspecieRepository;
import com.example.demo.repositores.VeterinarioRepository;

@SpringBootApplication
public class Ds2PraticoApplication implements CommandLineRunner {
	SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	@Autowired
	EspecieRepository especieRepository;
	
	@Autowired
	AnimalRepository animalRepository;
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	VeterinarioRepository veterinarioRepository;
	
	@Autowired
	ConsultaRepository consultaRepository;

	public static void main(String[] args) {
		SpringApplication.run(Ds2PraticoApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception{
		Especie especie1 = new Especie(null, "Felino");
		Especie especie2 = new Especie(null, "Canis");
		this.especieRepository.saveAll(Arrays.asList(especie1, especie2));
		
		Cliente cliente1 = new Cliente(null, "Jucíleudo Arantes", "Rua 13 de maio, bela vista, 51", "3482-5677", "juju@gmail.com");
		Cliente cliente2 = new Cliente(null, "Carmelita Donca", "Av. General Sampaio", "3252-1258", "kaka@gmail.com");
		this.clienteRepository.saveAll(Arrays.asList(cliente1, cliente2));
		
		Animal animal_1a = new Animal(null, "felix", 3, TipoSexo.MACHO, especie1, cliente1);
		Animal animal_2a = new Animal(null, "Tico", 2, TipoSexo.FEMEA, especie1, cliente1);
		Animal animal_1b = new Animal(null, "Cicarelle", 5, TipoSexo.FEMEA, especie2, cliente2);
		Animal animal_2b = new Animal(null, "Junior", 3, TipoSexo.MACHO, especie2, cliente2);
		this.animalRepository.saveAll(Arrays.asList(animal_1a, animal_1b, animal_2a, animal_2b));
		
		Veterinario v1 = new Veterinario(null, "Flávio Pinto", "12365654-45");
		Veterinario v2 = new Veterinario(null, "Michel Temer", "9876543-33");
		Veterinario v3 = new Veterinario(null, "Juciel Filho", "3434999-21");
		this.veterinarioRepository.saveAll(Arrays.asList(v1, v2, v3));
		
		Consulta con1 = new Consulta(null,data.parse("05/05/2020 13:45"), "Av Rui Barbosa, 100, Aldeota", "exame urina", animal_1a, v1);
		Consulta con2 = new Consulta(null,data.parse("05/12/2019 10:45"), "Av Rui Barbosa, 100, Aldeota", "raio x torax", animal_2a, v2);
		Consulta con3 = new Consulta(null,data.parse("25/05/2020 09:45"), "Av Rui Barbosa, 100, Aldeota", "Vacina Gripe", animal_1b, v2);
		Consulta con4 = new Consulta(null,data.parse("05/11/2018 14:45"), "Av Rui Barbosa, 100, Aldeota", "cirurgia rabo", animal_2b, v3);
		this.consultaRepository.saveAll(Arrays.asList(con1, con2, con3, con4));
	}

}
