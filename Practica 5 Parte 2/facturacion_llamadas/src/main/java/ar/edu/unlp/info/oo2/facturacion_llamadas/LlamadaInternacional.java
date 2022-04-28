package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada {

	public LlamadaInternacional(String tipoDeLlamada, Persona emisor, Persona remitente, int duracion) {
		super(tipoDeLlamada, emisor, remitente, duracion);
	}
	
	@Override
	public double calcularCosto() {
		return this.getDuracion() * 200 + (this.getDuracion() * 200 * 0.21);
	}


}
