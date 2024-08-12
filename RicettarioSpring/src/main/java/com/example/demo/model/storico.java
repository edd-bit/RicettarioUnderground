package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Storico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_storico;
	
	// da completare on le annotation join colum e @manytoone
	private int id_ruolo;
	
	// da completare on le annotation join colum e @manytoone
	private int id_dipendente;
	

	public int getId_storico() {
		return id_storico;
	}

	public void setId_storico(int id_storico) {
		this.id_storico = id_storico;
	}

	public int getId_ruolo() {
		return id_ruolo;
	}

	public void setId_ruolo(int id_ruolo) {
		this.id_ruolo = id_ruolo;
	}

	public int getId_dipendente() {
		return id_dipendente;
	}

	public void setId_dipendente(int id_dipendente) {
		this.id_dipendente = id_dipendente;
	}
	
	
	
	
}
