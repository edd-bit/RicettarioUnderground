package com.example.demo.dto;

import java.util.List;

import com.example.demo.model.Storico;

public class RuoliDto {

	 private int id_ruolo;
	    
	 private String descrizione;

	//Eduard dice che non è da mettere
	//List <Storico> lista_storico;
	 
	 
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

	@Override
	public String toString() {
		return "RuoliDto [id_ruolo=" + id_ruolo + ", descrizione=" + descrizione + "]";
	}
	
	 
	 
	 
	 
	 
}
