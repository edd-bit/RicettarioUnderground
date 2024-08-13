package com.example.demo.dto;

public class StoricoDto {

	private int id_storico;
	private int id_ruolo;
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
	
	@Override
	public String toString() {
		return "StoricoDto [id_storico=" + id_storico + ", id_ruolo=" + id_ruolo + ", id_dipendente=" + id_dipendente
				+ "]";
	}
	
	
	
	
	
}
