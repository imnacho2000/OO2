package ar.edu.unlp.info.oo2.Ejercicio3;

public class Cancelar extends EstadoProyecto {

	public Cancelar(Proyecto proyecto) {
		super(proyecto);
	}

	@Override
	String getEstado() {
		return "Cancelado";
	}
	

	@Override
	protected void invertirDinero(double unValor) {
		throw new RuntimeException("El Proyecto se encuentra cancelado no se puede invertir.");
	}
	
	@Override
	protected void cancelar() {
		throw new RuntimeException("El Proyecto ya se encuentra cancelado.");
	}

}
