package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ruoli implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    private int id_ruolo;
    
    private String descrizione;
    
    
    
    
    //
	public int getId_ruolo() {
		return id_ruolo;
	}

	public void setId_ruolo(int id_ruolo) {
		this.id_ruolo = id_ruolo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
    
    
    
    
    
}
