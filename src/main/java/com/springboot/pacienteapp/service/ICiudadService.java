package com.springboot.pacienteapp.service;

import java.util.List;

import com.springboot.pacienteapp.models.entity.Ciudad;
import com.springboot.pacienteapp.models.entity.Paciente;

public interface ICiudadService {
	
	List<Ciudad> listaCiudades();
	public void guardar(Ciudad ciudad);

}
