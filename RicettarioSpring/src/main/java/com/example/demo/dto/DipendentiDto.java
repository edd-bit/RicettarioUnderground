package com.example.demo.dto;

import java.util.List;

import com.example.demo.model.Dipendenti;

public class DipendentiDto {
	
	private int id_dipendente;
	
	private String nome;
	
	private String email;
	
	private String passw;
	
	//Eduard dice che non è da mettere
	//private List<Dipendenti> lista_dipendenti;
		

	public int getId_dipendente() {
		return id_dipendente;
	}

	public void setId_dipendente(int id_dipendente) {
		this.id_dipendente = id_dipendente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassw() {
		return passw;
	}

	public void setPassw(String passw) {
		this.passw = passw;
	}

	@Override
	public String toString() {
		return "DipendentiDto [id_dipendente=" + id_dipendente + ", nome=" + nome + ", email=" + email + ", passw="
				+ passw + "]";
	}
	
	
	
	
	

}
