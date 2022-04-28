package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaLocal extends Llamada {

	public LlamadaLocal(String tipoDeLlamada, Persona emisor, Persona remitente, int duracion) {
		super(tipoDeLlamada, emisor, remitente, duracion);
	}
	
	@Override
	public double calcularCosto() {
		if(this.getTipo().equals("nacional")) return super.getDur() * 3 + (super.getDur() * 3 * 0.21);
		return 0;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "nacional";
	}

}
