package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Ruoli;

public interface RuoliRepository extends JpaRepository<Ruoli, Integer> {

	public List<Ruoli> findByIdRuolo(int idRuolo);

	public List<Ruoli> findByDescrizione(String descrizione);
}
