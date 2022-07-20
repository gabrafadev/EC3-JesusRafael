package com.idat.EC3JesusRafaelReservaCita.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.idat.EC3JesusRafaelReservaCita.model.Hospital;


@RepositoryRestResource(path = "hospital")
public interface HospitalRepository extends JpaRepository<Hospital,Integer>{

}