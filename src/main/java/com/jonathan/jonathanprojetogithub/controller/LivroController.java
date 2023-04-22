package com.jonathan.jonathanprojetogithub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jonathan.jonathanprojetogithub.entity.Livro;
import com.jonathan.jonathanprojetogithub.service.LivroService;

import jakarta.validation.Valid;

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
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Livro cadastraLivro(@RequestBody @Valid Livro livro) {
		return this.livroService.cadastraLivro(livro);
	}
	
	
	@DeleteMapping("{id}")
	public void deletaClientePorId(@PathVariable Long id) throws Exception {
		livroService.deletaClientePorId(id);
	}
	
	
	
	
	} //finaliza a classe
	
	
	
	

