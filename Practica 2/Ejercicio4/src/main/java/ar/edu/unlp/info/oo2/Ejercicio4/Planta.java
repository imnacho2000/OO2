package ar.edu.unlp.info.oo2.Ejercicio4;

public class Planta extends Empleado {
	private boolean esCasado;
	private int cantAnios, cantHijos;
	private double sueldoBasico;
	
	
	public Planta(boolean esCasado, int cantAnios, int cantHijos) {
		super();
		this.esCasado = esCasado;
		this.cantAnios = cantAnios;
		this.cantHijos = cantHijos;
		this.sueldoBasico = 50000;
	}



	public boolean isEsCasado() {
		return esCasado;
	}



	public void setEsCasado(boolean esCasado) {
		this.esCasado = esCasado;
	}



	public int getCantAnios() {
		return cantAnios;
	}



	public void setCantAnios(int cantAnios) {
		this.cantAnios = cantAnios;
	}



	public int getCantHijos() {
		return cantHijos;
	}



	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}



	public double getBasico() {
		return this.sueldoBasico;
		
	}

	public double getAdicional() {
		if(this.isEsCasado()) {
			return 5000 + ( this.getCantHijos() * 2000) + (this.getCantAnios() * 2000);
		}
		return (this.getCantHijos() * 2000) + (this.getCantAnios() * 2000);
	}

}
