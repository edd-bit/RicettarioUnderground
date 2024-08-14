package com.example.demo.dto.builder;

import com.example.demo.dto.DipendentiDto;
import com.example.demo.model.Dipendenti;

public class DipendentiBuilder {
	
	// i Builder Sono delle classi che convertono/passono i dati dal Dto alle entity e viceversa
	public static Dipendenti fromDtoToEntity(DipendentiDto dipDto) {
		
		Dipendenti dip = new Dipendenti();
		
			dip.setIdDipendente(dipDto.getId_dipendente());
			dip.setNome(dipDto.getNome());
			dip.setEmail(dipDto.getEmail());
			dip.setPassw(dipDto.getPassw());
			
		return dip;	
		
	}
	
	public static DipendentiDto fromEntityToDto(Dipendenti dip) {
		
		DipendentiDto dipDto = new DipendentiDto();
		
			dipDto.setId_dipendente(dip.getIdDipendente());
			dipDto.setNome(dip.getNome());
			dipDto.setEmail(dip.getEmail());
			dipDto.setPassw(dip.getPassw());
			
		return dipDto;
	}

}
