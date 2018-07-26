package Logical;

public class Solicitudes {//esto se crea despues que el usauario inicia sision, entonces 
	//se crearia una clase "Registro" que tendria una lista de la clase ""Persona""

private String miPerfil;//obrero, tecnico o professional
private int miDisponibilidad; //medio tiempo, tiempo completo, freelancer 	
private float sueldoQueAspiro;
private boolean conLicencia;
private String[] idiomas;//los idiomas en la ventana de registrar solicitudes aparecen dinamicamente dependiendo los idiomas registrados en registrar trabajador
private boolean dispuestoAMudarme;
private String[] listaMisHAbilidades;
private boolean empleado;	//crear otro campo boolean para ver si esta contratado\
private boolean contratado;

public Solicitudes(String miPerfil, int miDisponibilidad, float sueldoQueAspiro, boolean conLicencia, String[] idiomas,
		boolean dispuestoAMudarme, String[] listaMisHAbilidades, boolean empleado, boolean contratado) {
	super();
	this.miPerfil = miPerfil;
	this.miDisponibilidad = miDisponibilidad;
	this.sueldoQueAspiro = sueldoQueAspiro;
	this.conLicencia = conLicencia;
	this.idiomas = idiomas;
	this.dispuestoAMudarme = dispuestoAMudarme;
	this.listaMisHAbilidades = listaMisHAbilidades;
	this.empleado = empleado;
	this.contratado = contratado;
}

public String getMiPerfil() {
	return miPerfil;
}

public void setMiPerfil(String miPerfil) {
	this.miPerfil = miPerfil;
}

public int getMiDisponibilidad() {
	return miDisponibilidad;
}

public void setMiDisponibilidad(int miDisponibilidad) {
	this.miDisponibilidad = miDisponibilidad;
}

public float getSueldoQueAspiro() {
	return sueldoQueAspiro;
}

public void setSueldoQueAspiro(float sueldoQueAspiro) {
	this.sueldoQueAspiro = sueldoQueAspiro;
}

public boolean isConLicencia() {
	return conLicencia;
}

public void setConLicencia(boolean conLicencia) {
	this.conLicencia = conLicencia;
}

public String[] getIdiomas() {
	return idiomas;
}

public void setIdiomas(String[] idiomas) {
	this.idiomas = idiomas;
}

public boolean isDispuestoAMudarme() {
	return dispuestoAMudarme;
}

public void setDispuestoAMudarme(boolean dispuestoAMudarme) {
	this.dispuestoAMudarme = dispuestoAMudarme;
}

public String[] getListaMisHAbilidades() {
	return listaMisHAbilidades;
}

public void setListaMisHAbilidades(String[] listaMisHAbilidades) {
	this.listaMisHAbilidades = listaMisHAbilidades;
}

public boolean isEmpleado() {
	return empleado;
}

public void setEmpleado(boolean empleado) {
	this.empleado = empleado;
}

public boolean isContratado() {
	return contratado;
}

public void setContratado(boolean contratado) {
	this.contratado = contratado;
}







}
