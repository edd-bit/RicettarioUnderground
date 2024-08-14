package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.Storico;

public interface StoricoRepository extends JpaRepository<Storico, Integer> {
// si fa questa cosa per poter utilizzare tutti i metodi che JpaRepository ha in automatico.
	
	// dopo findBy vuole 'prendere' prima da Ruoli e poi cercare l'id richiesto
	public List<Storico> findByRuoli_IdRuolo(int idRuolo);
	public List<Storico> findByDipendenti_idDipendente(int idDipendente);
	
	
	
	
}
