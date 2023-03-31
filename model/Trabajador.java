package model;

import java.util.ArrayList;

public abstract class Trabajador {
	private String nombre;
	private String tituloProfesional;
	private String direccion;
	private String estadoCivil;
	private String rut;
	private ArrayList<String> horarioTrabajo;

	public Trabajador(String nombre, String tituloProfesional, String direccion, String estadoCivil, String rut, ArrayList<String> horarioTrabajo) {
		this.nombre = nombre;
		this.tituloProfesional = tituloProfesional;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.rut = rut;
		this.horarioTrabajo = horarioTrabajo;
	}

	public abstract String getTipo();

	public String getNombre() {
		return this.nombre;
	}

	public String getTituloProfesional() {
		return this.tituloProfesional;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public ArrayList<String> getHorarioTrabajo() {
		throw new UnsupportedOperationException();
	}

	public void setHorarioTrabajo(ArrayList<String> horarioTrabajo) {
		throw new UnsupportedOperationException();
	}
}