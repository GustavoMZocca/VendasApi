package com.vendas.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendas.api.models.Vendas;

import java.util.*;

import com.vendas.api.repository.VendasRepository;

@RestController
@RequestMapping("/cadastra-venda")
public class VendasController {
	
	@Autowired
	private VendasRepository vendasRepository;
	
	@PostMapping
	public Vendas registrarVenda(@RequestBody Vendas vendas) {	
		
		return vendasRepository.save(vendas);
	}
	
	@GetMapping
	public List<Vendas>listar() {
		return vendasRepository.findAll();
	} 
	
	@RequestMapping
	public String home(Model model) {
		model.addAttribute("Title", "Teste prático de programação");
		return "vendas";
	} 
	
	
}
