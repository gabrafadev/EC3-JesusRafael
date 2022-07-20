package com.idat.EC3JesusRafaelReservaCita.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.EC3JesusRafaelReservaCita.dto.ClienteDTORequest;
import com.idat.EC3JesusRafaelReservaCita.dto.ClienteDTOResponse;
import com.idat.EC3JesusRafaelReservaCita.model.Cliente;
import com.idat.EC3JesusRafaelReservaCita.repository.ClienteRepository;


public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	@Override
	public void guardarCliente(ClienteDTORequest cliente) {
		// TODO Auto-generated method stub
		Cliente p = new Cliente();
		p.setNombre(cliente.getNombre());
		
		p.setCelular(cliente.getCelular());
		
		repository.save(p);

	}

	@Override
	public void actualizarCliente(ClienteDTORequest cliente) {
		// TODO Auto-generated method stub

		Cliente p = new Cliente();
		p.setNombre(cliente.getNombre());
		
		p.setCelular(cliente.getCelular());

		repository.saveAndFlush(p);
	}

	@Override
	public void eliminarCliente(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public List<ClienteDTOResponse> listarClientes() {
		List<ClienteDTOResponse> listar = new ArrayList<>();
		
		ClienteDTOResponse dto = null;
		
		List<Cliente> p = repository.findAll();
		
		for (Cliente productos : p) {
			
			dto = new ClienteDTOResponse();
			
			
			dto.setNombre(productos.getNombre());
			dto.setCelular(productos.getCelular());
	
			dto.setIdCliente(productos.getIdCliente());
			
			listar.add(dto);
		}
		
		return listar;
	}

	@Override
	public ClienteDTOResponse obtenerClienteId(Integer id) {
		// TODO Auto-generated method stub
		Cliente productos = repository.findById(id).orElse(null);
		ClienteDTOResponse dto = new ClienteDTOResponse();
		
		dto.setIdCliente(productos.getIdCliente());
		dto.setNombre(productos.getNombre());
		dto.setCelular(productos.getCelular());
		
		
		return dto;
	}

}
