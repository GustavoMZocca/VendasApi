package com.vendas.api.controllers;
import com.vendas.api.repository.VendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vendas.api.models.Vendas;

import java.util.*;

@Controller
public class VendasController {
	
	@Autowired
	private VendasRepository VendasRepository;
	
	@RequestMapping("/cadastrar-venda")
	public String processForm (Vendas vendas) {
		VendasRepository.save(vendas);
		return "redirect:/vendas";
	}
	
	@RequestMapping("/vendas")
	public ModelAndView ListVendas() {
		ModelAndView mv = new ModelAndView("/vendas");
		Iterable<Vendas> vendas = VendasRepository.findAll();
		mv.addObject("vendas", vendas);
		return mv;
	} 
	
	
	
}
