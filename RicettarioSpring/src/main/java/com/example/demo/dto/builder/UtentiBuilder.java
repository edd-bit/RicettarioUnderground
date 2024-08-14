package com.example.demo.dto.builder;

import com.example.demo.dto.UtentiDto;
import com.example.demo.model.Utenti;

public class UtentiBuilder {

	  public static Utenti fromDtoToEntity(UtentiDto utDto) {

	        Utenti ut = new Utenti();

	        ut.setId_utente(utDto.getId_utente());
	        ut.setEmailUtente(utDto.getEmail_utente());
	        ut.setPassw_utente(utDto.getPassw_utente());
	        return ut;
	    }

	    public static UtentiDto fromEntityToDto(Utenti ut) {
	        UtentiDto utDto = new UtentiDto();

	        utDto.setId_utente(ut.getId_utente());
	        utDto.setEmail_utente(ut.getEmailUtente());
	        utDto.setPassw_utente(ut.getPassw_utente());
	        return utDto;

	    }
	
}
