package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Utenti implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    @Id
    private int id_utente;
    
    private String email_utente;
    
    private String passw_utente;

	
    
    
    
    //
    public int getId_utente() {
		return id_utente;
	}

	public void setId_utente(int id_utente) {
		this.id_utente = id_utente;
	}

	public String getEmail_utente() {
		return email_utente;
	}

	public void setEmail_utente(String email_utente) {
		this.email_utente = email_utente;
	}

	public String getPassw_utente() {
		return passw_utente;
	}

	public void setPassw_utente(String passw_utente) {
		this.passw_utente = passw_utente;
	}
    
    
	
	
	
	
	
	
	
	
	
	
}
