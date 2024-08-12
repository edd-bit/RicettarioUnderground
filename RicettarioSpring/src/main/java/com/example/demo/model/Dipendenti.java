package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Dipendenti implements Serializable {
	private static final long serialVersionUID = 1L;
 
	//id_dipendente(PK),nome, email,passw
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_dipendente;
	
	private String nome;
	
	private String email;
	
	private String passw;

	@OneToMany(mappedBy="dipendenti", cascade = CascadeType.REMOVE)
	List <Dipendenti> lista_dipendenti;

		
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

	public List<Dipendenti> getLista_dipendenti() {
		return lista_dipendenti;
	}

	public void setLista_dipendenti(List<Dipendenti> lista_dipendenti) {
		this.lista_dipendenti = lista_dipendenti;
	}
	
	
	
	
}
