package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Utenti extends JpaRepository<Utenti, Integer> {
	
	public List<Utenti> findByEmail(String email_utente);
	public List<Utenti> findByEmailLike(String email_utente);
	
	
	
}
