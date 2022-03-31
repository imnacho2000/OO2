package ar.edu.unlp.info.oo2.Ejercicio2;

public class Pantano extends Topografia{
	
	
	public Pantano() {
	
	}
	
	
	@Override
	public double calcularProporcion() {
		return 0.7;
	}

	@Override
	protected Pantano getTopografia() {
		return this;
	}
	
	
}
