package com.jonathan.jonathanprojetogithub.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.jonathan.jonathanprojetogithub.entity.Livro;
import com.jonathan.jonathanprojetogithub.entity.LivroRepository;

public class LivroService {

	LivroRepository livroRepository;

	@Autowired
	public LivroService(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}

	public Livro retornaLivroPorId(long id) {
		
			return this.livroRepository.getReferenceById(id);
		
		
	}
	
	
	
	
	
}
