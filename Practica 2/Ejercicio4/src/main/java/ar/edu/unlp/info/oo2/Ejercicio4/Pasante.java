package ar.edu.unlp.info.oo2.Ejercicio4;

public class Pasante extends Empleado {
	private double sueldoBasico;
	public int cantExamenes;
	
	public Pasante(int cantExamenes) {
		this.sueldoBasico = 20000;
		this.cantExamenes = cantExamenes;
	}
	
	
	
	public int getCantExamenes() {
		return cantExamenes;
	}



	public void setCantExamenes(int cantExamenes) {
		this.cantExamenes = cantExamenes;
	}



	public double getBasico() {
		return this.sueldoBasico;
	}

	public double getAdicional() {
		return this.getCantExamenes() * 2000;
	}




}
