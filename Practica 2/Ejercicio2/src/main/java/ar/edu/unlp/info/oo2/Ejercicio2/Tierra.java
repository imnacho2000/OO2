package ar.edu.unlp.info.oo2.Ejercicio2;

public class Tierra extends Topografia{
	private double proporcion;
	
	public Tierra() {
		proporcion = 0;
	}



	@Override
	public double calcularProporcion() {
		return proporcion;
	}

	
	@Override
	protected Tierra getTopografia() {
		return this;
	}
	
}
