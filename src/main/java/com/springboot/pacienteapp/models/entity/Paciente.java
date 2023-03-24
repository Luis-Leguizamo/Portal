package com.springboot.pacienteapp.models.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name="pacientes")
public class Paciente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int documento;
	@Column(length=255)// Specifies a VARCHAR(255) column
	private String nombre;
	private String email;
	private String password;
	
	@ManyToOne
	@JoinColumn(name="ciudades_id")
	private Ciudad ciudad;

}
