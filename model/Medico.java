package model;

import java.util.ArrayList;

public class Medico extends Trabajador {
	private ArrayList<String> experiencia;

	public Medico(String nombre, String tituloProfesional, String direccion, String estadoCivil, String rut, ArrayList<String> horarioTrabajo, ArrayList<String> experiencia) {
		super(nombre, tituloProfesional, direccion, estadoCivil, rut, horarioTrabajo);
		this.experiencia = experiencia;
	}

	public String getExperiencia() {
		throw new UnsupportedOperationException();
	}

	public void setExperiencia(String experiencia) {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		return "Medico";
	}
}