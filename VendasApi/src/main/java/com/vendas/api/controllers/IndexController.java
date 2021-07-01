package com.vendas.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class IndexController {
	
	@RequestMapping("/")
	public String index() {
		System.out.println("Método index foi chamado");
		return "home";
	} 

}
