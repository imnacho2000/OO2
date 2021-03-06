package ar.edu.unlp.info.oo2.Ejercicio3;

public abstract class EstadoProyecto {
	
	protected Proyecto proyecto;
	
	public EstadoProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	
	abstract String getEstado();
	
	protected void invertirDinero(double unValor) {
		this.proyecto.addDinero(unValor);
		if(this.proyecto.consultarMontoTotalRecibido() >= this.proyecto.getDineroNecesario()) {
			this.proyecto.setEstado(new Conformar(proyecto));
		}
	}
		
	protected void publicar() {
		throw new RuntimeException("El Proyecto se encuentra" + this.getEstado() + " no se puede publicar.");
	}
	
	
	protected void cancelar() {
		this.proyecto.setEstado(new Cancelar(proyecto));
	}

	
}
