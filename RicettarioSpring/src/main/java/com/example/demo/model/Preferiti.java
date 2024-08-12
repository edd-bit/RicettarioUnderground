package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Preferiti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_pref;
	
	
	@ManyToOne
	@JoinColumn(name = "id_utente")
	private Utenti utenti;
	//un id utente legati a molti id preferiti

	private String nome_ricetta;

	private String link;

	public int getId_pref() {
		return id_pref;
	}

	public void setId_pref(int id_pref) {
		this.id_pref = id_pref;
	}

	

	public String getNome_ricetta() {
		return nome_ricetta;
	}

	public void setNome_ricetta(String nome_ricetta) {
		this.nome_ricetta = nome_ricetta;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Utenti getUtenti() {
		return utenti;
	}

	public void setUtenti(Utenti utenti) {
		this.utenti = utenti;
	}

}
