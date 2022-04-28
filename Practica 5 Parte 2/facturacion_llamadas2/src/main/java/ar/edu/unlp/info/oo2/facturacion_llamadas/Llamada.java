package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Llamada {
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

	public int getDur() {
		return duracionLlamada;
	}

	public void setDur(int dur) {
		this.duracionLlamada = dur;
	}

	public double calcularCosto() {
		if(this.getTipo().equals("internacional")) return this.getDur() * 200 + (this.getDur() * 200 * 0.21);
		else if (this.getTipo().equals("nacional")) return this.getDur() * 3 + (this.getDur() * 3 * 0.21);
		return -1;
	}
	

}
