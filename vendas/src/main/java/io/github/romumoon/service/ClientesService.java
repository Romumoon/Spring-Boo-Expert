package io.github.romumoon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.romumoon.model.Cliente;
import io.github.romumoon.repository.ClientesRepository;

@Service
public class ClientesService {
	
	private ClientesRepository clientesRepository;
	
	@Autowired
	public ClientesService(ClientesRepository clientesRepository) {
		super();
		this.clientesRepository = clientesRepository;
	}

	public void salvarCliente(Cliente cliente) {
		validarCliente(cliente);
		clientesRepository.persist(cliente);
	}
	
	public void validarCliente(Cliente cliente) {
		//valida cliente
	}
}
