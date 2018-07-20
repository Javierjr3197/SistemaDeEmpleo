package Logical;

import java.util.ArrayList;


public class Empresa {
	private String nombre;
	private String servicios;
	private String direccion;
	private String telefono;
	private String rni;
	ArrayList<Vacantes> misVacantes;
	
	public Empresa(String nombre, String servicios, String direccion, String telefono, String rni,
			ArrayList<Vacantes> misVacantes) {
		super();
		this.nombre = nombre;
		this.servicios = servicios;
		this.direccion = direccion;
		this.telefono = telefono;
		this.rni = rni;
		this.misVacantes = misVacantes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getServicios() {
		return servicios;
	}
	public void setServicios(String servicios) {
		this.servicios = servicios;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getRni() {
		return rni;
	}
	public void setRni(String rni) {
		this.rni = rni;
	}
	public ArrayList<Vacantes> getMisVacantes() {
		return misVacantes;
	}
	public void setMisVacantes(ArrayList<Vacantes> misVacantes) {
		this.misVacantes = misVacantes;
	}

}
