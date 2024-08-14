package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Preferiti;

public interface PreferitiRepository extends JpaRepository<Preferiti, Integer>{
	
	// find select, from = Preferiti, Where = nome_ricetta=? (parametro che tu gli passi in input)   + like %
	public List<Preferiti> findByNomeRicettaLike (String nomeRicetta);
	
}


