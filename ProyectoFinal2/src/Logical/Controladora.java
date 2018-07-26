package Logical;

import java.util.ArrayList;

public class Controladora {
	ArrayList<Empresa>empresas;
	ArrayList<Solicitud>solicitudes;
	ArrayList<Trabajador>trabajadores;
	ArrayList<Vacante>vacantes;
	
	public Controladora(ArrayList<Empresa> empresas, ArrayList<Solicitud> solicitudes,
			ArrayList<Trabajador> trabajadores, ArrayList<Vacante> vacantes) {
		super();
		this.empresas = empresas;
		this.solicitudes = solicitudes;
		this.trabajadores = trabajadores;
		this.vacantes = vacantes;
	}
	
	
	
	public ArrayList<Empresa> getEmpresas() {
		return empresas;
	}



	public void setEmpresas(ArrayList<Empresa> empresas) {
		this.empresas = empresas;
	}



	public ArrayList<Solicitud> getSolicitudes() {
		return solicitudes;
	}



	public void setSolicitudes(ArrayList<Solicitud> solicitudes) {
		this.solicitudes = solicitudes;
	}



	public ArrayList<Trabajador> getTrabajadores() {
		return trabajadores;
	}



	public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
		this.trabajadores = trabajadores;
	}



	public ArrayList<Vacante> getVacantes() {
		return vacantes;
	}



	public void setVacantes(ArrayList<Vacante> vacantes) {
		this.vacantes = vacantes;
	}



	public void agregarEmpresa(Empresa miEmpresa)
	{
		empresas.add(miEmpresa);
	}
	
	public void agregarTrabajador(Trabajador miTrabajador)
	{
		trabajadores.add(miTrabajador);
	}
	public void agregarSolicitud(Solicitud miSolicitud)
	{
		solicitudes.add(miSolicitud);
	}
	public void agregarVacante(Vacante miVacante)
	{
		vacantes.add(miVacante);
	}

	
	public Solicitud hacerMatching()
	{
		return null;
		
	}
}
