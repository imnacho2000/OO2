package ar.edu.unlp.info.oo2.Ejercicio2;

public class Agua extends Topografia {
	
	private double proporcion;
	
	public Agua() {
		
		this.proporcion = 1;
		
	}

	@Override
	public double calcularProporcion() {
		return proporcion;
	}

	@Override
	protected Agua getTopografia() {
		return this;
	}

}
