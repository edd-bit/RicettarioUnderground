package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
	@Column(name="id_dipendente")
	private int idDipendente;
	
	private String nome;
	
	private String email;
	
	private String passw;

	@OneToMany(mappedBy="dipendenti", cascade = CascadeType.REMOVE)
	private List <Storico> dipendenti;


	public int getIdDipendente() {
		return idDipendente;
	}

	public void setIdDipendente(int idDipendente) {
		this.idDipendente = idDipendente;
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

	public List<Storico> getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(List<Storico> dipendenti) {
		this.dipendenti = dipendenti;
	}

	

	
	
	
	
}
