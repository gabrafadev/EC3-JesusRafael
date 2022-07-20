package com.idat.EC3JesusRafaelReservaCita.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.EC3JesusRafaelReservaCita.dto.HospitalDTORequest;
import com.idat.EC3JesusRafaelReservaCita.dto.HospitalDTOResponse;
import com.idat.EC3JesusRafaelReservaCita.model.Hospital;
import com.idat.EC3JesusRafaelReservaCita.repository.HospitalRepository;


public class HospitalServiceImpl implements HospitalService {

	@Autowired
	private HospitalRepository repository;
	
	@Override
	public void guardarHospital(HospitalDTORequest hospital) {
		
		Hospital p = new Hospital();
		p.setNombre(hospital.getNombre());
		p.setDescripcion(hospital.getDescripcion());
		p.setDistrito(hospital.getDescripcion());
		
		repository.save(p);

	}

	@Override
	public void actualizarHospital(HospitalDTORequest hospital) {
		// TODO Auto-generated method stub
		Hospital p = new Hospital();
		p.setIdHospital(hospital.getIdHospital());
		p.setNombre(hospital.getNombre());
		p.setDescripcion(hospital.getDescripcion());
		p.setDistrito(hospital.getDescripcion());
		

		repository.saveAndFlush(p);

	}

	@Override
	public void eliminarHospital(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<HospitalDTOResponse> listarHospitales() {
		// TODO Auto-generated method stub
		List<HospitalDTOResponse> listar = new ArrayList<>();
		
		HospitalDTOResponse dto = null;
		
		List<Hospital> p = repository.findAll();
		
		for (Hospital productos : p) {
			
			dto = new HospitalDTOResponse();
			
			dto.setIdHospital(productos.getIdHospital());
			dto.setNombre(productos.getNombre());
			dto.setDescripcion(productos.getDescripcion());
			dto.setDistrito(productos.getDistrito());
			
			listar.add(dto);
		}
		
		return listar;
	}

	@Override
	public HospitalDTOResponse obtenerHospitalId(Integer id) {
		// TODO Auto-generated method stub
		Hospital productos = repository.findById(id).orElse(null);
		HospitalDTOResponse dto = new HospitalDTOResponse();
		
		dto.setIdHospital(productos.getIdHospital());
		dto.setNombre(productos.getNombre());
		dto.setDescripcion(productos.getDescripcion());
		dto.setDistrito(productos.getDistrito());
		
		
		return dto;
	}

}
