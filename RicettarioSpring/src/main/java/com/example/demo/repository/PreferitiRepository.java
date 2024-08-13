package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Preferiti;

public interface PreferitiRepository extends JpaRepository<Preferiti, Integer>{
	
	// like %
	public List<Preferiti> findByNomeRicettaLike (String nome_ricetta);
	
}


