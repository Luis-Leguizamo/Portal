package com.springboot.pacienteapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.pacienteapp.models.entity.Ciudad;
import com.springboot.pacienteapp.models.repository.CiudadRepository;

@Service
public class CiudadServiceImpl implements ICiudadService {
	
	@Autowired
	private CiudadRepository ciudadRepository;

	@Override
	public List<Ciudad> listaCiudades() {
		// TODO Auto-generated method stub
		return (List<Ciudad>) ciudadRepository.findAll();
	}

	@Override
	public void guardar(Ciudad ciudad) {
		ciudadRepository.save(ciudad);
	}

}
