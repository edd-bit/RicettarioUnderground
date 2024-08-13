package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Dipendenti;

public interface DipendentiRepository extends JpaRepository<Dipendenti, Integer> {
	//controllare perchè Integer
	
	// Il findById dovrebbe essere già dato di base, per il momento non lo inseriamo
	
	public List<Dipendenti> findByNome(String nome);
	
	public List<Dipendenti> findByEmail(String email);
	
	public List<Dipendenti> findByNomeAndEmail(String nome, String email);

}
