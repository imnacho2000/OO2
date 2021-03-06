package ar.edu.unlp.info.oo2.Ejercicio3;

public class Publicar extends EstadoProyecto {

	public Publicar(Proyecto proyecto) {
		super(proyecto);
	}

	@Override
	String getEstado() {
		return "Publicado";
	}
	
	@Override
	protected void publicar() {
		System.out.println("El proyecto se encuentra publicado.");
	}
	

}
