package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.Storico;

public interface StoricoRepository extends JpaRepository<Storico, Integer> {
	
	 //forse int non gli piace 
	public List<Storico> findByIdRuolo(int id_ruolo);
	public List<Storico> findByIdDipendente(int id_dipendente);
	
	
}
