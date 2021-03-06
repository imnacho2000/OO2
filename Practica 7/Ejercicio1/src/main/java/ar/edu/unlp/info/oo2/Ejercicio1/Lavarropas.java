	package ar.edu.unlp.info.oo2.Ejercicio1;

public class Lavarropas {
	private programacionDeLavados tiposLavado;
	private int enjuage,centrifugar,lavar,agua;
	
	public Lavarropas() {
	}
	
	public void setTipoLavado(programacionDeLavados tipo) {
		this.tiposLavado = tipo;
	}
	
	
	public void agregarAgua(int porcentaje) {
		System.out.println("Agregando agua");
		this.agua = porcentaje;
	}
	
	public void agregarJabon() {
		System.out.println("Agregando jabon");
	}
	
	public void lavar(int minutos) {
		System.out.println("Lavando por " + minutos + " minutos.");
		this.lavar = minutos;
	}
	
	public void vaciarAgua() {
		System.out.println("Vaciando agua");
	}
	
	public void agregarEnjuage() {
		System.out.println("Agregando enjuage");
	}
	
	public void enjuaga(int minutos) {
		System.out.println("Enjuagando por " + minutos + " minutos.");
		this.enjuage = minutos;
	}
	
	public void centrifugar(int minutos) {
		System.out.println("Centrifugando por " + minutos + " minutos.");
		this.centrifugar = minutos;
	} 
	
	public int getEnjuage() {
		return enjuage;
	}

	public int getCentrifugar() {
		return centrifugar;
	}

	public int getLavar() {
		return lavar;
	}


	public void inicializarMinutos() {
		this.setEnjuage(0);
		this.setCentrifugar(0);
		this.setLavar(0);
	}
	
	

	public void setEnjuage(int enjuage) {
		this.enjuage = enjuage;
	}

	public void setCentrifugar(int centrifugar) {
		this.centrifugar = centrifugar;
	}

	public void setLavar(int lavar) {
		this.lavar = lavar;
	}

	public int hacer() {
		return this.tiposLavado.programaLavado(this);
	}
	
}
