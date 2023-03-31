package model;

import java.util.ArrayList;

public class Administrativo extends Trabajador {
	private String correo;

	public Administrativo(String nombre, String tituloProfesional, String direccion, String estadoCivil, String rut, ArrayList<String> horarioTrabajo, String correo) {
		super(nombre, tituloProfesional, direccion, estadoCivil, rut, horarioTrabajo);
		this.correo = correo;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTipo() {
		return "Administrativo";
	}
}