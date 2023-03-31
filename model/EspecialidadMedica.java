package model;

import java.util.ArrayList;
import model.Medico;
import model.Administrativo;

public class EspecialidadMedica {
	private String nombre;
	private String ubicacion;
	private ArrayList<Medico> medicos;
	private ArrayList<Administrativo> administrativos;

	public EspecialidadMedica(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.medicos = new ArrayList<>();
		this.administrativos = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Medico> getMedicos() {
		return this.medicos;
	}

	public ArrayList<Administrativo> getAdministrativos() {
		return administrativos;
	}
}