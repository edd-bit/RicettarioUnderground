package com.example.demo.dto.builder;

import com.example.demo.dto.DipendentiDto;
import com.example.demo.model.Dipendenti;

public class DipendentiBuilder {
	
	
	public static Dipendenti fromDtoToEntity(DipendentiDto dipDto) {
		
		Dipendenti dip = new Dipendenti();
		
			dip.setId_dipendente(dipDto.getId_dipendente());
			dip.setNome(dipDto.getNome());
			dip.setEmail(dipDto.getEmail());
			dip.setPassw(dipDto.getPassw());
			
		return dip;	
		
	}
	
	public static DipendentiDto fromEntityToDto(Dipendenti dip) {
		
		DipendentiDto dipDto = new DipendentiDto();
		
			dipDto.setId_dipendente(dip.getId_dipendente());
			dipDto.setNome(dip.getNome());
			dipDto.setEmail(dip.getEmail());
			dipDto.setPassw(dip.getPassw());
			
		return dipDto;
	}

}
