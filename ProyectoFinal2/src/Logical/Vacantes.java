package Logical;

public class Vacantes {
	private String perfil;//obrero, tecnico o professional
	private int disponibilidad; //medio tiempo, tiempo completo, freelancer 
	private int personalNecesitado;
	private float sueldoAPagar;
	private boolean conLicencia;
	private String[] idiomas;
	private boolean dispuestoAMudarse;
	private String[] listaHAbilidades;
	
	public Vacantes(String perfil, int disponibilidad, int personalNecesitado, float sueldoAPagar, boolean conLicencia,
			String[] idiomas, boolean dispuestoAMudarse, String[] listaHAbilidades) {
		super();
		this.perfil = perfil;
		this.disponibilidad = disponibilidad;
		this.personalNecesitado = personalNecesitado;
		this.sueldoAPagar = sueldoAPagar;
		this.conLicencia = conLicencia;
		this.idiomas = idiomas;
		this.dispuestoAMudarse = dispuestoAMudarse;
		this.listaHAbilidades = listaHAbilidades;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	public int getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(int disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public int getPersonalNecesitado() {
		return personalNecesitado;
	}
	public void setPersonalNecesitado(int personalNecesitado) {
		this.personalNecesitado = personalNecesitado;
	}
	public float getSueldoAPagar() {
		return sueldoAPagar;
	}
	public void setSueldoAPagar(float sueldoAPagar) {
		this.sueldoAPagar = sueldoAPagar;
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
	public boolean isDispuestoAMudarse() {
		return dispuestoAMudarse;
	}
	public void setDispuestoAMudarse(boolean dispuestoAMudarse) {
		this.dispuestoAMudarse = dispuestoAMudarse;
	}
	public String[] getListaHAbilidades() {
		return listaHAbilidades;
	}
	public void setListaHAbilidades(String[] listaHAbilidades) {
		this.listaHAbilidades = listaHAbilidades;
	}

}
