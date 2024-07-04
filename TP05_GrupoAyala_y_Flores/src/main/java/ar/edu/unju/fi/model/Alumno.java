package ar.edu.unju.fi.model;

import java.util.Date;

import lombok.Data;




@Data
public class Alumno {
    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private Date fechaNacimiento;
    private String domicilio;
    private String LU;
    private Boolean estado;
}