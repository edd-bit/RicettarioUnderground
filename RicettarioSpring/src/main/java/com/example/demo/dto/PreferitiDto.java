package com.example.demo.dto;

public class PreferitiDto {
	
	private int id_pref;
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
	@Override
	public String toString() {
		return "PreferitiDto [id_pref=" + id_pref + ", id_utente=" + id_utente + ", nome_ricetta=" + nome_ricetta
				+ ", link=" + link + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
