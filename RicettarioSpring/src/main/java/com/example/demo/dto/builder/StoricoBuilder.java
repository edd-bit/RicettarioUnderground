package com.example.demo.dto.builder;

import com.example.demo.dto.StoricoDto;
import com.example.demo.model.Dipendenti;
import com.example.demo.model.Ruoli;
import com.example.demo.model.Storico;

public class StoricoBuilder {

	// i Builder Sono delle classi che convertono/passono i dati dal Dto alle entity e viceversa
	
	public static Storico fromDtoToEntity(StoricoDto stoDto) {
		
		Storico sto = new Storico();
		
			sto.setIdStorico(stoDto.getId_storico());
		
		Ruoli ruo = new Ruoli();
		
			ruo.setIdRuolo(stoDto.getId_ruolo());
			
		Dipendenti dip = new Dipendenti();
		
			dip.setId_dipendente(stoDto.getId_dipendente());
			
		return sto;
		
	}
	
	public static StoricoDto fromEntityToDto(Storico sto) {
		
		StoricoDto sDto = new StoricoDto();
		
			sDto.setId_storico(sto.getIdStorico());
			sDto.setId_ruolo(sto.getRuoli().getIdRuolo());
			sDto.setId_dipendente(sto.getDipendenti().getId_dipendente());
			
		return sDto;
	}
}
