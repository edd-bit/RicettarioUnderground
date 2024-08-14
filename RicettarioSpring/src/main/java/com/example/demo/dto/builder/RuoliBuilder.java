package com.example.demo.dto.builder;

import com.example.demo.dto.RuoliDto;
import com.example.demo.model.Ruoli;

public class RuoliBuilder {

	public static Ruoli fromDtoToEntity(RuoliDto ruoDto) {
		
		Ruoli ruoli = new Ruoli();
		
		ruoli.setDescrizione(ruoDto.getDescrizione());
		ruoli.setIdRuolo(ruoDto.getId_ruolo());
		
		return ruoli;
	}
	
	public static RuoliDto fromEntityToDto(Ruoli ruo) {
		
		RuoliDto ruoliDto = new RuoliDto();
		
		ruoliDto.setDescrizione(ruo.getDescrizione());
		ruoliDto.setId_ruolo(ruo.getIdRuolo());
		
		return ruoliDto;
	}
}
