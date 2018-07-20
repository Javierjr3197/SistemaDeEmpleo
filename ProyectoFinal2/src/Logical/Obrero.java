package Logical;

import java.util.ArrayList;

public class Obrero extends Trabajador {
	private String[] habilidades;

	public String[] getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String[] habilidades) {
		this.habilidades = habilidades;
	}

	public Obrero(String nombre, String apellido, String direccion, String telefono, String cedula, int edad,
			String genero, ArrayList<Solicitudes> misSolicitudes, String[] habilidades) {
		super(nombre, apellido, direccion, telefono, cedula, edad, genero, misSolicitudes);
		this.habilidades = habilidades;
	}

}
