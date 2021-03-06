package ar.edu.unlp.info.oo2.Ejercicio2;

public abstract class Topografia {
	public abstract double calcularProporcion();
	
	public  boolean comparar(Topografia t1) {
		return t1.calcularProporcion() == this.calcularProporcion();
	}
	
	protected abstract Object getTopografia();
	
	public double getProporcionTierra() {
		return 1-this.calcularProporcion();
	}
	
}
