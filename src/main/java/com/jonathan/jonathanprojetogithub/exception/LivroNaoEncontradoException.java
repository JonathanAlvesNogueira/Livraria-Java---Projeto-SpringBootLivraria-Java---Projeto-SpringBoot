package com.jonathan.jonathanprojetogithub.exception;

public class LivroNaoEncontradoException extends Exception {

	public LivroNaoEncontradoException(Long id) {
		super(String.format("O cliente de Id %d não foi encontrado", id));
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
}
