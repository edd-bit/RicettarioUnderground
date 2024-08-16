package com.example.demo.ctr;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.UtentiDto;


@Controller
@RequestMapping("ricettariospring/utente")
public class AccessoUtentiCtr {
	
	@GetMapping("/formAccessoUtente")
    public String formAccessoUtente(Model model) {
		
		UtentiDto u = new UtentiDto();
		
		model.addAttribute("utenteForm", u);
		
        return "formAccessoUtente";
    }
	
//	@GetMapping("/homeutente")
//	public String homeUtente() {
//		
//		return "formAccessoUtente";
//	}
	
	@GetMapping("/accessosuccesso")
	public String accessoSuccesso() {
		
		return null;
	}
	
	

	
	

}
