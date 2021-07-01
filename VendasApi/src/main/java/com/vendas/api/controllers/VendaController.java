package com.vendas.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VendaController {
	
	@RequestMapping("/formVenda")
	public String form() {
		
		return "formVenda";
		
	}
	

}
