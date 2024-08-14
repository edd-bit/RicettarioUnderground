package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Storico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_storico")
	private int idStorico;
	
	@ManyToOne
	@JoinColumn(name="id_ruolo") //id_ruolo è una fk
	private Ruoli ruoli;
	
	@ManyToOne
	@JoinColumn(name="id_dipendente") //id_dipendente è una fk
	private Dipendenti dipendenti;

	public int getIdStorico() {
		return idStorico;
	}

	public void setIdStorico(int idStorico) {
		this.idStorico = idStorico;
	}

	public Ruoli getRuoli() {
		return ruoli;
	}

	public void setRuoli(Ruoli ruoli) {
		this.ruoli = ruoli;
	}

	public Dipendenti getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(Dipendenti dipendenti) {
		this.dipendenti = dipendenti;
	}
	

	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

