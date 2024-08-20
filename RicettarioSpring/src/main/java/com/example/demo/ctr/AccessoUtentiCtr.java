package com.example.demo.ctr;


import java.util.List;

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

	// pre accesso utente
	@GetMapping("/formAccessoUtente")
	public String formAccessoUtente(Model model) {

		UtentiDto u = new UtentiDto();

		model.addAttribute("utenteForm", u);

		return "utente/formAccessoUtente";
	}

	// post login utente
	@PostMapping("/homeutente")
	public String postformAccessoUtente(Model model, @ModelAttribute("utenteForm") UtentiDto udto) {

		model.addAttribute("utenteForm", udto);

		List<Utenti> utentiTrovati = uRep.findByEmailUtenteAndPasswUtente(udto.getEmail_utente(),udto.getPassw_utente());

		for (Utenti utenti : utentiTrovati) {
			System.out.println(utenti);
		}
		System.out.println(udto.getEmail_utente() + " " + udto.getPassw_utente());

		if (!utentiTrovati.isEmpty()) {
			System.out.println("Accesso avvvenuto con successo");
			return "utente/homeUtente";
		} else {
			model.addAttribute("error", "Email o password Errati");
		}

		System.out.println("fuori if");
		return "utente/formAccessoUtente";
	}

	@GetMapping("/formRegistrazioneUtenti")
	public String formRegistrazioneUtenti(Model model) {
		
		
			UtentiDto uDto = new UtentiDto();

	        model.addAttribute("formRegistrazioneU", uDto);

	        return "utente/formRegistrazioneUtenti";
	}

	@PostMapping("/inserimentoNuovoUtente")
	public String inserimentoNuovoUtente(Model model,@ModelAttribute("formRegistrazioneU") UtentiDto udto) {
		// RequestBody è usata per mappare il corpo della richiesta HTTP all'oggetto
		// UtentiDto
		/*
		 * @ModelAttribute prende l’attributo con scritto studentForm è lo inserisce
		 * dentro Studente s path relativo aggiunge l’action nella pagina dove ci
		 * troviamo assoluto usa tutto il link
		 * 
		 */
		/*
		 * da eliminare perché la funzione è già svolta da riga 66 Utenti u = new
		 * Utenti();
		 * 
		 * 
		 * u.setEmailUtente(uDto.getEmail_utente());
		 * u.setPasswUtente(uDto.getPassw_utente());
		 * 
		 */
		
		List<Utenti> utentiTrovati = uRep.findByEmailUtenteAndPasswUtente(udto.getEmail_utente(),udto.getPassw_utente());
		
		//if(se lista non vuota)....
		if (!utentiTrovati.isEmpty()) {
			
			model.addAttribute("error", "Email già usata");
			return "utente/formRegistrazioneUtenti";
		} else {
			uRep.save(UtentiBuilder.fromDtoToEntity(udto));
			
		}

		
		/*
		 * Questa riga di codice sta prendendo un DTO (uDto), lo sta convertendo in
		 * un'entità (Utenti) utilizzando un metodo statico (fromDtoToEntity) di una
		 * classe builder (UtentiBuilder), e infine sta salvando questa entità nel
		 * database attraverso il repository (uRep).
		 */

		return "utente/registrazioneUtenteSuccess";
	}

	@PostMapping("/loginUtente")
	public String loginUtente(@RequestBody String entity) {

		return entity;
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
