package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Cliente;


public interface ClienteService {
	
	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Long id);
	
	void inserir(Cliente cliente);
	
	void atualizar(Long id,Cliente novoCliente);
	
	void deletar(Long id);

}
