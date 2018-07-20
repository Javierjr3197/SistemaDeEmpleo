package Logical;

import java.util.ArrayList;



public class Trabajador {
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private String cedula;
	private int edad;
	private String genero;
	private ArrayList<Solicitudes> misSolicitudes;
	
	public Trabajador(String nombre, String apellido, String direccion, String telefono, String cedula, int edad,
			String genero, ArrayList<Solicitudes> misSolicitudes) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.cedula = cedula;
		this.edad = edad;
		this.genero = genero;
		this.misSolicitudes = misSolicitudes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public ArrayList<Solicitudes> getMisSolicitudes() {
		return misSolicitudes;
	}
	public void setMisSolicitudes(ArrayList<Solicitudes> misSolicitudes) {
		this.misSolicitudes = misSolicitudes;
	}

}
