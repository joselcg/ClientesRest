package com.bolsaideas.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsaideas.springboot.backend.apirest.model.entity.Cliente;
import com.bolsaideas.springboot.backend.apirest.models.dao.IClienteDao;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll(){
		return (List<Cliente>)clienteDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		// TODO Auto-generated method stub
		//return clienteDao.findById(id);
		return null;
	}
	
	@Override
	@Transactional(readOnly = true)
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDao.save(cliente);
	}
	
	@Override
	@Transactional(readOnly = true)
	public void delete(Long id) {
		clienteDao.delete(id);	
	}
	
	

}
