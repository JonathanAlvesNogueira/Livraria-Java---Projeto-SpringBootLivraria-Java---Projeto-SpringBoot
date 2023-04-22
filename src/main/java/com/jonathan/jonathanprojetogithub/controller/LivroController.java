package com.jonathan.jonathanprojetogithub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jonathan.jonathanprojetogithub.entity.Livro;
import com.jonathan.jonathanprojetogithub.service.LivroService;

@RestController
public class LivroController {

	LivroService livroService;

	@Autowired
	public LivroController(LivroService livroService) {
		this.livroService = livroService;
	}
	
	@GetMapping("/{id}")
	public Livro retornaLivroPorId(@PathVariable long id) throws Exception {
			return this.livroService.retornaLivroPorId(id);
			
		}
	}
	
	
	
	

