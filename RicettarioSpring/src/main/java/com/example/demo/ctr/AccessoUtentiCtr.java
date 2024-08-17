package com.example.demo.ctr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.UtentiDto;
import com.example.demo.dto.builder.UtentiBuilder;
import com.example.demo.model.Utenti;
import com.example.demo.repository.UtentiRepository;


@Controller
@RequestMapping("ricettariospring/utente")
public class AccessoUtentiCtr {
	
	
	@Autowired
	private UtentiRepository uRep;
	// cerchiamo di capire a cosa serve l'Autowired
	
	
	@GetMapping("/formAccessoUtente")
    public String formAccessoUtente(Model model) {
		
		UtentiDto u = new UtentiDto();
		
		model.addAttribute("utenteForm", u);
		
        return "formAccessoUtente";
    }
	
	@GetMapping("/formRegistrazioneUtenti")
	public String formRegistrazioneUtenti(Model model) {
		
		UtentiDto uDto = new UtentiDto();
		
		model.addAttribute("formRegistrazioneU", uDto);
		
		return "formRegistrazioneUtenti";
	}
	
	
	@PostMapping("/inserimentoNuovoUtente")
	public String inserimentoNuovoUtente (@ModelAttribute ("formRegistrazioneU")UtentiDto uDto) { 
	// RequestBody è usata per mappare il corpo della richiesta HTTP all'oggetto UtentiDto	
		
		Utenti u = new Utenti();
		
		u.setEmailUtente(uDto.getEmail_utente());
		u.setPassw_utente(uDto.getPassw_utente());
		
		uRep.save(UtentiBuilder.fromDtoToEntity(uDto));
		/* Questa riga di codice sta prendendo un DTO (uDto), lo sta convertendo 
		 * in un'entità (Utenti) utilizzando un metodo statico (fromDtoToEntity) 
		 * di una classe builder (UtentiBuilder), e infine sta salvando questa 
		 * entità nel database attraverso il repository (uRep).
		 */

		return "registrazioneUtenteSuccess";
	}
	
	
//	@GetMapping("/accessosuccesso")
//	public String accessoSuccesso() {
//		
//		return null;
//	}	
	
	
//	 inserimento nuovo utente
//	 accesso e controllo di utente
//	 in accedi si verifica la password se è corretta, oltre all'email
	
	
	
//	@GetMapping("/homeutente")
//	public String homeUtente() {
//		
//		return "formAccessoUtente";
//	}

}









