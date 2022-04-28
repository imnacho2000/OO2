package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	private String tipoDeLlamada;
	private Persona emisor;
	private Persona remitente;
	private int duracionLlamada;
	
	public Llamada(String tipoDeLlamada, Persona emisor, Persona remitente, int duracionLlamada) {
		this.tipoDeLlamada = tipoDeLlamada;
		this.emisor = emisor;
		this.remitente= remitente;
		this.duracionLlamada = duracionLlamada;
	}
	
	public String getTipo() {
		return this.tipoDeLlamada;
	}
	
	public void setTipoDeLlamada(String tipoDeLlamada) {
		this.tipoDeLlamada = tipoDeLlamada;
	}
	
	public Persona getEmisor() {
		return emisor;
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

	public int getDuracion() {
		return duracionLlamada;
	}

	public void setDuracion(int dur) {
		this.duracionLlamada = dur;
	}

	public abstract double calcularCosto();
	

}
