package Logical;

import java.util.ArrayList;

public class Graduado extends Trabajador {
	private String area;

	public Graduado(String nombre, String apellido, String direccion, String telefono, String cedula, int edad,
			String genero, ArrayList<Solicitudes> misSolicitudes) {
		super(nombre, apellido, direccion, telefono, cedula, edad, genero, misSolicitudes);
		// TODO Auto-generated constructor stub
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
