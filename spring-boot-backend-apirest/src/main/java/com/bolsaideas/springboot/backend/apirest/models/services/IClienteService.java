package com.bolsaideas.springboot.backend.apirest.models.services;

import java.util.List;


import com.bolsaideas.springboot.backend.apirest.model.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	
	

}
