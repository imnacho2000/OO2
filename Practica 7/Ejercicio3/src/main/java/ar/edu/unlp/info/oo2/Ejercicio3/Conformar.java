package ar.edu.unlp.info.oo2.Ejercicio3;

public class Conformar extends EstadoProyecto{

	public Conformar(Proyecto proyecto) {
		super(proyecto);
	}

	@Override
	String getEstado() {
		return "Conformado";
	}
	
	@Override
	protected void cancelar() {
		throw new RuntimeException("El Proyecto se encuentra conformado no se puede cancelar.");
	}
	
	
	@Override
	protected void invertirDinero(double unValor) {
		this.proyecto.addDinero(unValor);
	}

}
