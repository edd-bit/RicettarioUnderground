package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.UtentiDto;
import com.example.demo.model.Utenti;

public interface UtentiRepository extends JpaRepository<Utenti, Integer> {
	
	public List<Utenti> findByEmailUtente(String emailUtente);
	public List<Utenti> findByEmailUtenteLike(String emailUtente);
	public List<Utenti> findByEmailUtenteAndPasswUtente(String emailUtente, String passwUtente);

	
}
