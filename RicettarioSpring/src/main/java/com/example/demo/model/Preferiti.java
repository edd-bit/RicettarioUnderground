package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Preferiti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_pref;
//da rivedere un attimo con tipo classe
	@ManyToOne
	@JoinColumn(name = "id_utente")
	private int id_utente;

	private String nome_ricetta;

	private String link;

	public int getId_pref() {
		return id_pref;
	}

	public void setId_pref(int id_pref) {
		this.id_pref = id_pref;
	}

	public int getId_utente() {
		return id_utente;
	}

	public void setId_utente(int id_utente) {
		this.id_utente = id_utente;
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

}
