package ar.edu.unlp.info.oo2.Ejercicio4;

public class Temporario extends Empleado {
	private int cantidadDeHoras, cantidadDeHijos;
	private boolean esCasado;
	private double sueldoBasico;
	
	public Temporario(int cantidadDeHoras, boolean esCasado, int cantidadDeHijos) {
		this.cantidadDeHoras = cantidadDeHoras;
		this.cantidadDeHijos = cantidadDeHijos;
		this.esCasado = esCasado;
		this.sueldoBasico = 20000;
	}
	
	
	
		
	public int getCantidadDeHijos() {
		return cantidadDeHijos;
	}




	public void setCantidadDeHijos(int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}




	public boolean isEsCasado() {
		return esCasado;
	}




	public void setEsCasado(boolean esCasado) {
		this.esCasado = esCasado;
	}




	public int getCantidadDeHoras() {
		return cantidadDeHoras;
	}



	public void setCantidadDeHoras(int cantidadDeHoras) {
		this.cantidadDeHoras = cantidadDeHoras;
	}
	
	
	public double getBasico() {
		return this.sueldoBasico + (this.getCantidadDeHoras() * 300);
	}

	public double getAdicional() {
		if(this.isEsCasado()) {
			return 5000 + (2000 * this.getCantidadDeHijos());
		}
		return (2000 * this.getCantidadDeHijos());
	}

}
