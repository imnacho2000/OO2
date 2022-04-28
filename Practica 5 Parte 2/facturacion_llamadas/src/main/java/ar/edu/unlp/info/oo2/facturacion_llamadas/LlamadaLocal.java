package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaLocal extends Llamada {

	public LlamadaLocal(String tipoDeLlamada, Persona emisor, Persona remitente, int duracion) {
		super(tipoDeLlamada, emisor, remitente, duracion);
	}
	
	@Override
	public double calcularCosto() {
		return this.getDuracion() * 3 + (this.getDuracion() * 3 * 0.21);
	}
}
