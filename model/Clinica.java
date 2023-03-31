package model;

import java.util.ArrayList;
import model.Trabajador;
import model.EspecialidadMedica;

public class Clinica {
	private String tipo;
	private ArrayList<Trabajador> trabajadores;
	private ArrayList<EspecialidadMedica> especialidadesMedicas;

	public Clinica(String tipo) {
		this.tipo=tipo;
		this.trabajadores=new ArrayList<>();
		this.especialidadesMedicas=new ArrayList<>();
	}

	public String getTipo() {
		return this.tipo;
	}

	public ArrayList<Medico> obtenerMedicos() {
		ArrayList<Medico>medicos=new ArrayList<>();
		for(Trabajador trabajador:this.trabajadores){
			if(trabajador.getTipo().equals("Medico")){
				medicos.add((Medico) trabajador);
			}
		}
		return medicos;
	}

	public ArrayList<Administrativo> obtenerAdministrativos() {
		ArrayList<Administrativo>administrativos=new ArrayList<>();
		for(Trabajador trabajador:this.trabajadores){
			if(trabajador.getTipo().equals("Administrativo")){
				administrativos.add((Administrativo) trabajador);
			}
		}
		return administrativos;
	}

	public ArrayList<Medico> obtenerMedicosEspecialidadMedica(EspecialidadMedica especialidadMedica, String nombre) {
		ArrayList<Medico>medicosConElMismoNombre=new ArrayList<>();
		for (Medico medico:especialidadMedica.getMedicos()){
			if(medico.getNombre().equals(nombre)){
				medicosConElMismoNombre.add(medico);
			}
		}
		return medicosConElMismoNombre;
	}

	public Administrativo obtenerAdministrativoEspecialidadMedica(EspecialidadMedica especialidadMedica, String nombre, String rut) {
		for (Administrativo administrativo:especialidadMedica.getAdministrativos()){
			if(administrativo.getNombre().equals(nombre) || administrativo.getRut().equals(rut)){
				return administrativo;
			}
		}
		return null;
	}
}