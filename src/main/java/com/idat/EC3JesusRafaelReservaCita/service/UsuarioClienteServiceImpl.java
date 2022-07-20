package com.idat.EC3JesusRafaelReservaCita.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.EC3JesusRafaelReservaCita.dto.UsuarioClienteDTORequest;
import com.idat.EC3JesusRafaelReservaCita.dto.UsuarioClienteDTOResponse;
import com.idat.EC3JesusRafaelReservaCita.model.UsuarioCliente;
import com.idat.EC3JesusRafaelReservaCita.repository.UsuarioClienteRepository;


public class UsuarioClienteServiceImpl implements UsuarioClienteService {

	@Autowired
	private UsuarioClienteRepository repository;
	
	@Override
	public void guardarUsuarioClientel(UsuarioClienteDTORequest usuariocliente) {
		// TODO Auto-generated method stub
		UsuarioCliente p = new UsuarioCliente();
		p.setUsuario(usuariocliente.getUsuario());
		p.setPassword(usuariocliente.getPassword());
		p.setRol(usuariocliente.getRol());
		
		repository.save(p);

	}

	@Override
	public void actualizarUsuarioCliente(UsuarioClienteDTORequest usuariocliente) {
		// TODO Auto-generated method stub
		UsuarioCliente p = new UsuarioCliente();
		p.setIdUsuario(usuariocliente.getIdUsuario());
		p.setPassword(usuariocliente.getPassword());
		p.setRol(usuariocliente.getRol());
		p.setUsuario(usuariocliente.getUsuario());
		

		repository.saveAndFlush(p);

	}

	@Override
	public void eliminarUsuarioCliente(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public List<UsuarioClienteDTOResponse> listarUsuarioClientes() {
		// TODO Auto-generated method stub
		List<UsuarioClienteDTOResponse> listar = new ArrayList<>();
		
		UsuarioClienteDTOResponse dto = null;
		
		List<UsuarioCliente> p = repository.findAll();
		
		for (UsuarioCliente productos : p) {
			
			dto = new UsuarioClienteDTOResponse();
			
			dto.setIdUsuario(productos.getIdUsuario());
			dto.setPassword(productos.getPassword());
			dto.setRol(productos.getRol());
			dto.setUsuario(productos.getUsuario());
			
			listar.add(dto);
		}
		
		return listar;
	}

	@Override
	public UsuarioClienteDTOResponse obtenerUsuarioClienteId(Integer id) {
		// TODO Auto-generated method stub
		UsuarioCliente productos = repository.findById(id).orElse(null);
		UsuarioClienteDTOResponse dto = new UsuarioClienteDTOResponse();
		
		dto.setIdUsuario(productos.getIdUsuario());
		dto.setPassword(productos.getPassword());
		dto.setRol(productos.getRol());
		dto.setUsuario(productos.getUsuario());
		
		return dto;
	}

}
