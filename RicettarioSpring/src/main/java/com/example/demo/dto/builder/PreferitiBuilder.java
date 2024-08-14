package com.example.demo.dto.builder;

import com.example.demo.dto.PreferitiDto;
import com.example.demo.model.Preferiti;
import com.example.demo.model.Utenti;

public class PreferitiBuilder {

	// i Builder Sono delle classi che convertono/passono i dati dal Dto alle entity e viceversa
	public static Preferiti fromDtoToEntity(PreferitiDto prefDto) {
	
		Preferiti pref = new Preferiti();	
		
		pref.setIdPref(prefDto.getId_pref());
		pref.setLink(prefDto.getLink());
		pref.setNomeRicetta(prefDto.getNome_ricetta());
		
		Utenti u = new Utenti();
		
		u.setId_utente(prefDto.getId_utente());
		
	return pref;
	
	}
	
	public static PreferitiDto fromEntityToDto(Preferiti pref) {
		
		PreferitiDto prefDto = new PreferitiDto();	
		
		prefDto.setId_pref(pref.getIdPref());
		prefDto.setLink(pref.getLink());
		prefDto.setNome_ricetta(pref.getNomeRicetta());
		prefDto.setId_utente(pref.getUtenti().getId_utente());
		
	return prefDto;
	}
	
}
