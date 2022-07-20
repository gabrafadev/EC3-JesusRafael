package com.idat.EC3JesusRafaelReservaCita.service;

import java.util.List;

import com.idat.EC3JesusRafaelReservaCita.dto.UsuarioClienteDTORequest;
import com.idat.EC3JesusRafaelReservaCita.dto.UsuarioClienteDTOResponse;



public interface UsuarioClienteService {
	
	
	void guardarUsuarioClientel(UsuarioClienteDTORequest usuariocliente);
	void actualizarUsuarioCliente(UsuarioClienteDTORequest usuariocliente);
	void eliminarUsuarioCliente(Integer id);
	List<UsuarioClienteDTOResponse> listarUsuarioClientes();
	UsuarioClienteDTOResponse obtenerUsuarioClienteId(Integer id);

}