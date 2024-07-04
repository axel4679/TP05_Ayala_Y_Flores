package ar.edu.unju.fi.model;

import lombok.Data;

@Data
public class Materia {
	private String codigo;
	private String nombre;
	private String curso;
	private int horas;
	private String modalidad;
	private String docente;
	private String carrera;
	private Boolean estado;
}
