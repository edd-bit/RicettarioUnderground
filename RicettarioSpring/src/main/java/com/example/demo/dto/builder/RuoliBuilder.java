package com.example.demo.dto.builder;

import com.example.demo.dto.RuoliDto;
import com.example.demo.model.Ruoli;

public class RuoliBuilder {

	public static Ruoli fromDtoToEntity(RuoliDto ruoDto) {
		
		Ruoli ruoli = new Ruoli();
		
		ruoli.setDescrizione(ruoli.getDescrizione());
		ruoli.setId_ruolo(ruoli.getId_ruolo());
		
		return ruoli;
	}
	
	public static RuoliDto fromEntityToDto(Ruoli ruo) {
		
		RuoliDto ruoliDto = new RuoliDto();
		
		ruoliDto.setDescrizione(ruoliDto.getDescrizione());
		ruoliDto.setId_ruolo(ruoliDto.getId_ruolo());
		
		return ruoliDto;
	}
}
