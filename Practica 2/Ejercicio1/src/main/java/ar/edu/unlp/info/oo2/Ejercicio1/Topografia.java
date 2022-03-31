package ar.edu.unlp.info.oo2.Ejercicio1;

public abstract class Topografia {
	public abstract double calcularProporcion();
	
	public  boolean equals(Topografia t1) {
		return t1.calcularProporcion() == this.calcularProporcion();
	}
	
	public boolean equals(Object c) {
		return this.equals((Topografia)c);
	}
	
	protected abstract Object getTopografia();
	
	public double getProporcionTierra() {
		return 1-this.calcularProporcion();
	}
}
