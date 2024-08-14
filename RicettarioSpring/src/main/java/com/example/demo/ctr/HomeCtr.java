package com.example.demo.ctr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeCtr {
//ctr home di RicettarioSpring
	
	@GetMapping("/home")
	public String home() {
		
		return "home";
	}
}
