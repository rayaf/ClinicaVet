package com.example.demo.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Consulta;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Integer>{

}
