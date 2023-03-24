package com.springboot.pacienteapp.controller;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.pacienteapp.models.entity.Ciudad;
import com.springboot.pacienteapp.models.entity.Paciente;
import com.springboot.pacienteapp.service.ICiudadService;
import com.springboot.pacienteapp.service.IPacienteService;

@Controller
@Slf4j
@RequestMapping("/pacientes")
public class PacienteController {

	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private ICiudadService ciudadService;

	@GetMapping(value = "/listar")
	public String listarPacientes(Model model) {
		List<Paciente> listadoPacientes = pacienteService.listartodos();

		model.addAttribute("titulo", "Lista de Pacientes");
		model.addAttribute("pacientes", listadoPacientes);

		return "/views/pacientes/listar";
	}

	@GetMapping("/create")
	public String crear(Model model) {

		Paciente paciente = new Paciente();
		List<Ciudad> listCiudades = ciudadService.listaCiudades();

		log.info("llegue aqui");
		
		model.addAttribute("titulo", "Formulario: Nuevo Paciente");
		model.addAttribute("paciente", paciente);
		model.addAttribute("ciudades", listCiudades);
		
		return "/views/pacientes/frmCrear";
	}

	@PostMapping("/create/save")
	public String guardarRegistro(Model model, Paciente paciente) {
		pacienteService.guardar(paciente);
		return "redirect:/pacientes/create?success";
	}

}