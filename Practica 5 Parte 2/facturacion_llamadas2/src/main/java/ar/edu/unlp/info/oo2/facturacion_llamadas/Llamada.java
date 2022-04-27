package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	protected String tipoDeLlamada;
	private Persona emisor;
	private Persona remitente;
	public int duracionLlamada;
	
	public Llamada(String tipoDeLlamada, Persona emisor, Persona remitente, int duracionLlamada) {
		this.tipoDeLlamada = tipoDeLlamada;
		this.emisor = emisor;
		this.remitente= remitente;
		this.duracionLlamada = duracionLlamada;
	}

	public void setTipoDeLlamada(String tipoDeLlamada) {
		this.tipoDeLlamada = tipoDeLlamada;
	}
	public void setEmisor(Persona emisor) {
		this.emisor = emisor;
	}
	public Persona getRemitente() {
		return remitente;
	}
	public void setRemitente(Persona remitente) {
		this.remitente = remitente;
	}

	public int getDur() {
		return duracionLlamada;
	}

	public void setDur(int dur) {
		this.duracionLlamada = dur;
	}

	public Persona getEmisor() {
		return emisor;
	}
	
	public abstract double calcularCosto();
	
	public abstract String getTipo();
	
	
}