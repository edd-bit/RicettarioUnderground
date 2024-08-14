package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Ruoli;

public interface RuoliRepository extends JpaRepository<Ruoli, Integer> {

	public List<Ruoli> findByid_ruolo(int id_ruolo);

	public List<Ruoli> findByDescrizione(String descrizione);
}
