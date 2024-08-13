package com.example.demo.dto.builder;

import com.example.demo.dto.PreferitiDto;
import com.example.demo.model.Preferiti;

public class PreferitiBuilder {

	// i Builder Sono delle classi che convertono/passono i dati dal Dto alle entity e viceversa
	public static Preferiti fromDtoToEntity(PreferitiDto prefDto) {
	
		Preferiti pref = new Preferiti();	
		
		pref.setId_pref(pref.getId_pref());
		pref.setLink(pref.getLink());
		pref.setNome_ricetta(pref.getNome_ricetta());
		pref.setUtenti(pref.getUtenti());
		
	return pref;
	
	}
	
	public static PreferitiDto fromEntityToDto(Preferiti pref) {
		
		PreferitiDto prefDto = new PreferitiDto();	
		
		prefDto.setId_pref(prefDto.getId_pref());
		prefDto.setLink(prefDto.getLink());
		prefDto.setNome_ricetta(prefDto.getNome_ricetta());
		prefDto.setId_utente(prefDto.getId_utente());
		
	return prefDto;
	}
	
}
