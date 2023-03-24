package com.springboot.pacienteapp.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.pacienteapp.models.entity.Ciudad;

public interface CiudadRepository extends CrudRepository<Ciudad, Long> {

}
