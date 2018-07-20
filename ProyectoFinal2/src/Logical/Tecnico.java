package Logical;

import java.util.ArrayList;

public class Tecnico extends Trabajador {
	private int aniosExperiencia;
	private String areaDeTrabajo;
	
	
	public Tecnico(String nombre, String apellido, String direccion, String telefono, String cedula, int edad,
			String genero, ArrayList<Solicitudes> misSolicitudes, int aniosExperiencia, String areaDeTrabajo) {
		super(nombre, apellido, direccion, telefono, cedula, edad, genero, misSolicitudes);
		this.aniosExperiencia = aniosExperiencia;
		this.areaDeTrabajo = areaDeTrabajo;
	}
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	public String getAreaDeTrabajo() {
		return areaDeTrabajo;
	}
	public void setAreaDeTrabajo(String areaDeTrabajo) {
		this.areaDeTrabajo = areaDeTrabajo;
	}

}
