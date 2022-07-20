package com.idat.EC3JesusRafaelReservaCita.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.idat.EC3JesusRafaelReservaCita.model.Cliente;



@RepositoryRestResource(path = "cliente")
public interface ClienteRepository extends JpaRepository<Cliente,Integer>{

}