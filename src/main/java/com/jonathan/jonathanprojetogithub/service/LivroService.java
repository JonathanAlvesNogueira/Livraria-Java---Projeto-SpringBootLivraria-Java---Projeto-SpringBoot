package com.jonathan.jonathanprojetogithub.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.jonathan.jonathanprojetogithub.entity.Livro;
import com.jonathan.jonathanprojetogithub.entity.LivroRepository;
import com.jonathan.jonathanprojetogithub.exception.LivroNaoEncontradoException;

import jakarta.validation.Valid;

public class LivroService {

	LivroRepository livroRepository;

	@Autowired
	public LivroService(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}

	public Livro retornaLivroPorId(long id) throws Exception{
		if(this.livroRepository.existsById(id)){
			return this.livroRepository.getReferenceById(id);
		}
		
		throw new LivroNaoEncontradoException(id);
		
	}

	public Livro cadastraLivro(Livro livro) {
		return this.livroRepository.save(livro);
	}

	public void deletaClientePorId(Long id) {
		return this.livroRepository.deleteById(id);;
	}
	
	
	
	
	
}
