package com.jonathan.jonathanprojetogithub.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.jonathan.jonathanprojetogithub.exception.LivroService;

public class LivroController {

	LivroService livroService;

	@Autowired
	public LivroController(LivroService livroService) {
		this.livroService = livroService;
	}
	
	
	
	
}
