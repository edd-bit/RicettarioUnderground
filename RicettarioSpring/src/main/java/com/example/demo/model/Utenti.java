package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Utenti implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_utente;
    
    private String email_utente;
    
    private String passw_utente;
    
    //la classe Preferiti è legata grazie alla riga 25 di questa classe Utenti
    @OneToMany(mappedBy="utenti")
    private List<Preferiti> lista_preferiti;
    
    
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

	public List<Preferiti> getLista_preferiti() {
		return lista_preferiti;
	}

	public void setLista_preferiti(List<Preferiti> lista_preferiti) {
		this.lista_preferiti = lista_preferiti;
	}
    
	
    
	
	
	
}
