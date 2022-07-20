package com.idat.EC3JesusRafaelReservaCita.service;

import java.util.List;

import com.idat.EC3JesusRafaelReservaCita.dto.HospitalDTORequest;
import com.idat.EC3JesusRafaelReservaCita.dto.HospitalDTOResponse;

public interface HospitalService {
	
	
	void guardarHospital(HospitalDTORequest hospital);
	void actualizarHospital(HospitalDTORequest hospital);
	void eliminarHospital(Integer id);
	List<HospitalDTOResponse> listarHospitales();
	HospitalDTOResponse obtenerHospitalId(Integer id);

}