package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada {

	public LlamadaInternacional(String tipoDeLlamada, Persona emisor, Persona remitente, int duracion) {
		super(tipoDeLlamada, emisor, remitente, duracion);
	}
	
	@Override
	public double calcularCosto() {
		if(this.getTipo().equals("internacional")) return super.getDur() * 200 + (super.getDur() * 200 * 0.21);
		else return 0;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "internacional";
	}

}
