package com.springboot.pacienteapp.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.pacienteapp.models.entity.Paciente;


@Repository
public interface PacienteRepository extends CrudRepository<Paciente, Long> {
	
	

}
