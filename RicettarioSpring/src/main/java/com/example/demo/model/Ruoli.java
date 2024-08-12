package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Ruoli implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // non 'dovrebbe' portare nessun problema
    private int id_ruolo;
    
    private String descrizione;
    
    @OneToMany(mappedBy="ruoli") //viene preso da storico ruoli
    List <Storico> lista_storico;
    
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

	public List<Storico> getLista_storico() {
		return lista_storico;
	}

	public void setLista_storico(List<Storico> lista_storico) {
		this.lista_storico = lista_storico;
	}
    
    
    
    
    
}
