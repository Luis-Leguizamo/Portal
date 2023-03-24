package com.springboot.pacienteapp.service;

import java.util.List;

import com.springboot.pacienteapp.models.entity.Paciente;

public interface IPacienteService {
	
	public List<Paciente> listartodos();
	public void guardar(Paciente paciente);
	public Paciente buscarPorId(Long id);
	public void eliminar(Long id);

}
