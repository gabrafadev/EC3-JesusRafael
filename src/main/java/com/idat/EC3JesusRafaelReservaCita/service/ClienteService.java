package com.idat.EC3JesusRafaelReservaCita.service;

import java.util.List;

import com.idat.EC3JesusRafaelReservaCita.dto.ClienteDTORequest;
import com.idat.EC3JesusRafaelReservaCita.dto.ClienteDTOResponse;


public interface ClienteService {
	
	
	void guardarCliente(ClienteDTORequest cliente);
	void actualizarCliente(ClienteDTORequest cliente);
	void eliminarCliente(Integer id);
	List<ClienteDTOResponse> listarClientes();
	ClienteDTOResponse obtenerClienteId(Integer id);

}