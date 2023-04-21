package com.jonathan.jonathanprojetogithub.exception;

import org.springframework.beans.factory.annotation.Autowired;

import com.jonathan.jonathanprojetogithub.entity.LivroRepository;

public class LivroService {

	LivroRepository livroRepository;

	@Autowired
	public LivroService(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}
	
	
	
	
}
