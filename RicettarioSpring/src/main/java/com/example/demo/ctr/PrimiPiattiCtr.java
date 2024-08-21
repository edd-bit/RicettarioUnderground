package com.example.demo.ctr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/primi")
public class PrimiPiattiCtr {
	
	@GetMapping("/PrimiPiatti")
	public String paginaPrimi() {
		
		return "primi/PrimiPiatti";
	}
}
